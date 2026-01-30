package com.example.volunteertracker.repository.inmemory;
import com.example.volunteertracker.repository.AssignmentRepository;
import com.example.volunteertracker.model.Assignment;
import java.util.*;

public class InMemoryAssignmentRepository implements AssignmentRepository {
    private Map<String, Assignment> store = new HashMap<>();

    @Override
    public Assignment save(Assignment entity) {
        // TODO: Implement save logic
        return entity;
    }

    @Override
    public Optional<Assignment> findById(String id) {
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public List<Assignment> findAll() {
        return new ArrayList<>(store.values());
    }
}
