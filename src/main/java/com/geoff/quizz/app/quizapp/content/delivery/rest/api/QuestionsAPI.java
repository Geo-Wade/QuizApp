package com.geoff.quizz.app.quizapp.content.delivery.rest.api;

import com.geoff.quizz.app.quizapp.dao.model.Question;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface QuestionsAPI {
    ResponseEntity<List<Question>> getAllQuestions();
    ResponseEntity<List<Question>> getQuestionsByCategory(@PathVariable String category);
    ResponseEntity<String> addQuestion(@RequestBody Question question);
    ResponseEntity<String> removeQuestion (@PathVariable Integer id);
    }
