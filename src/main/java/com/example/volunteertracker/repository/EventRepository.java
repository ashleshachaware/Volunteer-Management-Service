package com.example.volunteertracker.repository;
import com.example.volunteertracker.model.Event;
import java.util.List;
import java.util.Optional;

public interface EventRepository {
    Event save(Event entity);
    Optional<Event> findById(String id);
    List<Event> findAll();
}
