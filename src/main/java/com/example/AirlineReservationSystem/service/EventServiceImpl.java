package com.example.AirlineReservationSystem.service;

import com.example.AirlineReservationSystem.model.Event;
import com.example.AirlineReservationSystem.repository.EventRepository;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.Iterator;

@Service
public class EventServiceImpl implements EventService {

    @Override
    public Iterable<Event> findByName(String name) {
        return new Iterable<Event>() {
            @NotNull
            @Override
            public Iterator<Event> iterator() {
                return null;
            }
        };
    }
}
