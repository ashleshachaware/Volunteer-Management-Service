#!/bin/bash

# Define base paths
BASE_PKG="com/example/volunteertracker"
MAIN_DIR="src/main/java/$BASE_PKG"
TEST_DIR="src/test/java/$BASE_PKG"

# Create Directories
mkdir -p "$MAIN_DIR/model"
mkdir -p "$MAIN_DIR/repository/inmemory"
mkdir -p "$MAIN_DIR/service"
mkdir -p "$MAIN_DIR/exception"
mkdir -p "$TEST_DIR/unit/service"
mkdir -p "$TEST_DIR/integration"

# --- Create Models ---
for model in Volunteer Event Assignment HourLog; do
  echo "package com.example.volunteertracker.model;
public class $model {
    // TODO: Add fields
}" > "$MAIN_DIR/model/$model.java"
done

# --- Create Repositories (Interfaces) ---
for repo in Volunteer Event Assignment HourLog; do
  echo "package com.example.volunteertracker.repository;
import com.example.volunteertracker.model.$repo;
import java.util.List;
import java.util.Optional;

public interface ${repo}Repository {
    ${repo} save(${repo} entity);
    Optional<${repo}> findById(String id);
    List<${repo}> findAll();
}" > "$MAIN_DIR/repository/${repo}Repository.java"
done

# --- Create InMemory Implementations ---
for repo in Volunteer Event Assignment HourLog; do
  echo "package com.example.volunteertracker.repository.inmemory;
import com.example.volunteertracker.repository.${repo}Repository;
import com.example.volunteertracker.model.$repo;
import java.util.*;

public class InMemory${repo}Repository implements ${repo}Repository {
    private Map<String, $repo> store = new HashMap<>();

    @Override
    public $repo save($repo entity) {
        // TODO: Implement save logic
        return entity;
    }

    @Override
    public Optional<$repo> findById(String id) {
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public List<$repo> findAll() {
        return new ArrayList<>(store.values());
    }
}" > "$MAIN_DIR/repository/inmemory/InMemory${repo}Repository.java"
done

# --- Create Exceptions ---
for exc in NotFound Validation DuplicateEntity; do
  echo "package com.example.volunteertracker.exception;
public class ${exc}Exception extends RuntimeException {
    public ${exc}Exception(String message) {
        super(message);
    }
}" > "$MAIN_DIR/exception/${exc}Exception.java"
done

# --- Create Services ---
# (Generic skeleton for services)
for service in Volunteer Event Assignment HourTracking Report; do
  echo "package com.example.volunteertracker.service;
public class ${service}Service {
    // TODO: Inject repositories
}" > "$MAIN_DIR/service/${service}Service.java"
done

# --- Create App.java ---
echo "package com.example.volunteertracker;
public class App {
    public static void main(String[] args) {
        System.out.println(\"Volunteer Tracker App Started...\");
    }
}" > "$MAIN_DIR/App.java"

# --- Create Tests ---
for test in VolunteerService EventService AssignmentService HourTrackingService ReportService; do
  echo "package com.example.volunteertracker.unit.service;
import org.junit.jupiter.api.Test;
public class ${test}Test {
    @Test
    void testExample() {
        // TODO: Write unit tests
    }
}" > "$TEST_DIR/unit/service/${test}Test.java"
done

echo "package com.example.volunteertracker.integration;
import org.junit.jupiter.api.Test;
public class VolunteerTrackingIntegrationTest {
    @Test
    void testFullFlow() {
        // TODO: Write integration tests
    }
}" > "$TEST_DIR/integration/VolunteerTrackingIntegrationTest.java"

echo "Structure created successfully!"