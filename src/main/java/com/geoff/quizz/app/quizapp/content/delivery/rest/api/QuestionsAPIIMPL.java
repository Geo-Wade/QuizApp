package com.geoff.quizz.app.quizapp.content.delivery.rest.api;

import com.geoff.quizz.app.quizapp.dao.model.Question;
import com.geoff.quizz.app.quizapp.dao.persistance.QuestionRepo;
import com.geoff.quizz.app.quizapp.services.QuestionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("questions")
public class QuestionsAPIIMPL {
    QuestionService questionService;
    QuestionsAPIIMPL(QuestionService questionService) {
        this.questionService = questionService;
    }
    @GetMapping("/allQuestions")
    List<Question> getAllQuestions() {
        return questionService.getAllQuestions();
    }
    @GetMapping("category/{category}")
    List<Question> getQuestionsByCategory(@PathVariable String category) {
        return questionService.getQuestionByCategory(category);
    }

    @PostMapping("add")
    public String addQuestion(@RequestBody Question question) {
        questionService.addQuestion(question);
        return "success";
    }
}
