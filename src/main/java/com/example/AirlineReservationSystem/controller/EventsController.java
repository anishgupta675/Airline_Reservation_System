package com.example.AirlineReservationSystem.controller;

import com.example.AirlineReservationSystem.model.Event;
import com.example.AirlineReservationSystem.service.EventService;
import com.example.AirlineReservationSystem.service.EventServiceImpl;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/events", produces = { MediaType.TEXT_HTML_VALUE })
public class EventsController {

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String showEventByName(@ModelAttribute Event event, @RequestParam (value = "search", required = false) String name, Model model) {
        model.addAttribute("event", event);
        EventService eventService = new EventServiceImpl();
        model.addAttribute("searchResult", eventService.findByName(name));

        return "events/index";
    }
}
