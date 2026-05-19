package com.geoff.quizz.app.quizapp.content.delivery.rest.api;

import org.springframework.http.ResponseEntity;

public interface QuizAPI {
    ResponseEntity<String> createQuiz(String category, int numQ, String title);
}
