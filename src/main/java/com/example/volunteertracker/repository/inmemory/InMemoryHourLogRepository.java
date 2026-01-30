package com.example.volunteertracker.repository.inmemory;
import com.example.volunteertracker.repository.HourLogRepository;
import com.example.volunteertracker.model.HourLog;
import java.util.*;

public class InMemoryHourLogRepository implements HourLogRepository {
    private Map<String, HourLog> store = new HashMap<>();

    @Override
    public HourLog save(HourLog entity) {
        // TODO: Implement save logic
        return entity;
    }

    @Override
    public Optional<HourLog> findById(String id) {
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public List<HourLog> findAll() {
        return new ArrayList<>(store.values());
    }
}
