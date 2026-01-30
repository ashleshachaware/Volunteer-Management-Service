package com.example.volunteertracker.repository.inmemory;
import com.example.volunteertracker.repository.VolunteerRepository;
import com.example.volunteertracker.model.Volunteer;
import java.util.*;

public class InMemoryVolunteerRepository implements VolunteerRepository {
    private Map<String, Volunteer> store = new HashMap<>();

    @Override
    public Volunteer save(Volunteer entity) {
        // TODO: Implement save logic
        return entity;
    }

    @Override
    public Optional<Volunteer> findById(String id) {
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public List<Volunteer> findAll() {
        return new ArrayList<>(store.values());
    }
}
