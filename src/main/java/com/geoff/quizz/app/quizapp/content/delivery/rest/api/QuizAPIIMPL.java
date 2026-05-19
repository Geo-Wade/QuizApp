package com.geoff.quizz.app.quizapp.content.delivery.rest.api;

import com.geoff.quizz.app.quizapp.services.QuizService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("quiz")
public class QuizAPIIMPL implements QuizAPI{
    QuizService quizService;

    QuizAPIIMPL(QuizService quizService) {
        this.quizService = quizService;
    }
    @Override
    @GetMapping("create")
    public ResponseEntity<String> createQuiz(@RequestParam String category, @RequestParam int numQ, @RequestParam String title) {
        return new ResponseEntity<>("", HttpStatus.FORBIDDEN);
    }
}
