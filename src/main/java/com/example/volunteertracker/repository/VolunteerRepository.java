package com.example.volunteertracker.repository;
import com.example.volunteertracker.model.Volunteer;
import java.util.List;
import java.util.Optional;

public interface VolunteerRepository {
    Volunteer save(Volunteer entity);
    Optional<Volunteer> findById(String id);
    List<Volunteer> findAll();
}
