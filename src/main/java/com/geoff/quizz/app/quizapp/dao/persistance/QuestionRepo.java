package com.geoff.quizz.app.quizapp.dao.persistance;

import com.geoff.quizz.app.quizapp.dao.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepo extends JpaRepository<Question, Integer> {
    List<Question> findByCategory(String category);
}
