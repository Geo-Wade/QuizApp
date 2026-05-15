package com.geoff.quizz.app.quizapp.content.delivery.rest.api;

import com.geoff.quizz.app.quizapp.dao.model.Question;

import java.util.List;

public interface QuestionsAPI {
    List<Question> getAllQuestions();
}
