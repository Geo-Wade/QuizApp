package com.geoff.quizz.app.quizapp.services;

import com.geoff.quizz.app.quizapp.dao.model.Question;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

public interface QuestionService {
    ResponseEntity<List<Question>> getAllQuestions();
    ResponseEntity<List<Question>> getQuestionByCategory(String category);
    ResponseEntity<String> addQuestion(Question question);
    ResponseEntity<String> removeQuestion(Integer id);
}
