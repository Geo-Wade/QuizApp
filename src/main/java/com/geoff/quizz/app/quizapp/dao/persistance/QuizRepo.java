package com.geoff.quizz.app.quizapp.dao.persistance;

import com.geoff.quizz.app.quizapp.dao.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepo extends JpaRepository<Quiz, Integer> {
}
