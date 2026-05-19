package com.geoff.quizz.app.quizapp.services;

import com.geoff.quizz.app.quizapp.dao.persistance.QuizRepo;

public class QuizServiceIMPL implements QuizService{
    QuizRepo quizRepo;

    QuizServiceIMPL(QuizRepo quizRepo) {
        this.quizRepo = quizRepo;
    }
}
