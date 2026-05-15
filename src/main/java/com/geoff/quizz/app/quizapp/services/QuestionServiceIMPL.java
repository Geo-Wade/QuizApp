package com.geoff.quizz.app.quizapp.services;

import com.geoff.quizz.app.quizapp.dao.model.Question;
import com.geoff.quizz.app.quizapp.dao.persistance.QuestionRepo;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class QuestionServiceIMPL implements QuestionService{
    QuestionRepo questionRepo;
    QuestionServiceIMPL(QuestionRepo questionRepo) {
        this.questionRepo = questionRepo;
    }
    public List<Question> getAllQuestions() {
        return questionRepo.findAll();
    }

    @Override
    public List<Question> getQuestionByCategory(String category) {
        return questionRepo.findByCategory(category);
    }

    @Override
    public String addQuestion(Question question) {
        questionRepo.save(question);
        return "Success";
    }
}