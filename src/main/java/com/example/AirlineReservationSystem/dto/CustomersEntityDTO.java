package com.example.AirlineReservationSystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomersEntityDTO {

    public int userId;

    @NotBlank(message = "First Name is required")
    @Size(min = 1, max = 70, message = "First Name must be more than 1 character and less than 70 characters")
    @Pattern.List({
            // @Pattern(regexp = "^\\S*$", message = "First Name cannot contain any whitespaces and special characters"),
            // @Pattern(regexp = "^[A-Za-z0-9 ]+$", message = "First Name cannot contain any whitespaces and special characters")
            @Pattern(regexp = "[a-zA-Z ]*$", message = "First Name cannot contain any special characters and digits")
    })
    public String firstName;

    @NotBlank(message = "Last Name is required")
    @Size(min = 1, max = 70, message = "Last Name must be more than 1 character and less than 70 characters")
    @Pattern.List({
            // @Pattern(regexp = "^\\S*$", message = "Last Name cannot contain any whitespaces and special characters"),
            // @Pattern(regexp = "^[A-Za-z0-9 ]+$", message = "Last Name cannot contain any whitespaces and special characters")
            @Pattern(regexp = "[a-zA-Z ]*$", message = "Last Name cannot contain any special characters and digits")
    })
    public String lastName;

    @NotBlank(message = "Email is required")
    @Email(message = "Please enter a correct email")
    public String email;

    @NotBlank(message = "Password is required")
    @Size(min = 6, message = "Password must be more than 5 characters")
    public String password;

    @NotBlank(message = "Confirm Password is required")
    public String confirmPassword;
}
