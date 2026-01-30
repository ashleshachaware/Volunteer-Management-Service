package com.example.volunteertracker.exception;
public class NotFoundException extends RuntimeException {
    public NotFoundException(String message) {
        super(message);
    }
}
