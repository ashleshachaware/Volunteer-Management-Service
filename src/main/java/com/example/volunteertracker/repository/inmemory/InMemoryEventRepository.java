package com.example.volunteertracker.repository.inmemory;
import com.example.volunteertracker.repository.EventRepository;
import com.example.volunteertracker.model.Event;
import java.util.*;

public class InMemoryEventRepository implements EventRepository {
    private Map<String, Event> store = new HashMap<>();

    @Override
    public Event save(Event entity) {
        // TODO: Implement save logic
        return entity;
    }

    @Override
    public Optional<Event> findById(String id) {
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public List<Event> findAll() {
        return new ArrayList<>(store.values());
    }
}
