package com.geoff.quizz.app.quizapp.services;

import com.geoff.quizz.app.quizapp.dao.model.Question;
import com.geoff.quizz.app.quizapp.dao.persistance.QuestionRepo;
import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class QuestionServiceIMPL implements QuestionService{
    QuestionRepo questionRepo;
    QuestionServiceIMPL(QuestionRepo questionRepo) {
        this.questionRepo = questionRepo;
    }
    public ResponseEntity<List<Question>> getAllQuestions() {
        try {
            return new ResponseEntity<>(questionRepo.findAll(), HttpStatus.OK);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
    }

    @Override
    public ResponseEntity<List<Question>> getQuestionByCategory(String category) {
        try {
            return new ResponseEntity<>(questionRepo.findByCategory(category), HttpStatus.OK);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
    }

    @Override
    public ResponseEntity<String> addQuestion(Question question) {
        try {
            questionRepo.save(question);
            return new ResponseEntity<>("Success", HttpStatus.OK);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>("Error", HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<String> removeQuestion(Integer id) {
        try {
            questionRepo.delete(questionRepo.getReferenceById(id));
            return new ResponseEntity<>("Success", HttpStatus.OK);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return  new ResponseEntity<>("Failed", HttpStatus.BAD_REQUEST);
    }
}