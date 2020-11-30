package com.vitevskii.planner.service;

import com.vitevskii.planner.entity.Session;

import java.time.LocalDateTime;

public interface SessionService {
    String NAME = "planner_SessionService";

    Session rescheduleSession(Session session, LocalDateTime newStartDate);
}