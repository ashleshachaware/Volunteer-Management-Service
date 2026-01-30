package com.example.volunteertracker.repository;
import com.example.volunteertracker.model.HourLog;
import java.util.List;
import java.util.Optional;

public interface HourLogRepository {
    HourLog save(HourLog entity);
    Optional<HourLog> findById(String id);
    List<HourLog> findAll();
}
