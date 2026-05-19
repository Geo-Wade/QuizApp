package com.geoff.quizz.app.quizapp.content.delivery.rest.api;

import com.geoff.quizz.app.quizapp.dao.model.Question;
import com.geoff.quizz.app.quizapp.dao.persistance.QuestionRepo;
import com.geoff.quizz.app.quizapp.services.QuestionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController()
@RequestMapping("questions")
public class QuestionsAPIIMPL implements QuestionsAPI{
    QuestionService questionService;
    QuestionsAPIIMPL(QuestionService questionService) {
        this.questionService = questionService;
    }
    @GetMapping("/allQuestions")
    public ResponseEntity<List<Question>> getAllQuestions() {
        return questionService.getAllQuestions();
    }
    @GetMapping("category/{category}")
    public ResponseEntity<List<Question>> getQuestionsByCategory(@PathVariable String category) {
        return questionService.getQuestionByCategory(category);
    }
    @PostMapping("add")
    public ResponseEntity<String> addQuestion(@RequestBody Question question) {
            return questionService.addQuestion(question);
    }
    @DeleteMapping("remove/{id}")
    public ResponseEntity<String> removeQuestion (@PathVariable Integer id) {
        return questionService.removeQuestion(id);
    }
}
