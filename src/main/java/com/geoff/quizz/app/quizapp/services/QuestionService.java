package com.geoff.quizz.app.quizapp.services;

import com.geoff.quizz.app.quizapp.dao.model.Question;
import org.springframework.stereotype.Component;

import java.util.List;

public interface QuestionService {
    List<Question> getAllQuestions();
    List<Question> getQuestionByCategory(String category);
    String addQuestion(Question question);
}
