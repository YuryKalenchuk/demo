package service;

import data.entity.Feedback;

import java.util.List;

public interface DriverService {
    List<Feedback> getAllFeedbacks();

    String replyFeedback(String feedbackId);
}