package com.example.volunteertracker.repository;
import com.example.volunteertracker.model.Assignment;
import java.util.List;
import java.util.Optional;

public interface AssignmentRepository {
    Assignment save(Assignment entity);
    Optional<Assignment> findById(String id);
    List<Assignment> findAll();
}
