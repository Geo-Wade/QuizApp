package com.geoff.quizz.app.quizapp.services;

import com.geoff.quizz.app.quizapp.dao.model.Question;
import com.geoff.quizz.app.quizapp.dao.persistance.QuestionRepo;
import org.springframework.stereotype.Component;
import org.w3c.dom.ls.LSException;

import java.io.*;
import java.util.Arrays;
import java.util.List;

@Component
public class BootstrapperIMPL implements Bootstrapper {

    QuestionRepo questionRepo;

    public BootstrapperIMPL(QuestionRepo questionRepo) {
        this.questionRepo = questionRepo;
    }

    public void bootStrapQuestions() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("db_question_bootstrap.csv"));
        String nextLine;
        while ((nextLine = bufferedReader.readLine()) != null) {
            List<String> newObjList = Arrays.asList(nextLine.split(","));
            questionRepo.save(questionBuilder(newObjList));
        }

    }

    private Question questionBuilder(List<String> questionValues) {
        Question question = new Question();
        if(questionValues.size() == 8) {
            question.setCategory(questionValues.get(0).trim());
            question.setDifficultyLevel(questionValues.get(1).trim());
            question.setOption1(questionValues.get(2).trim());
            question.setOption2(questionValues.get(3).trim());
            question.setOption3(questionValues.get(4).trim());
            question.setOption4(questionValues.get(5).trim());
            question.setQuestionTitle(questionValues.get(6).trim());
            question.setRightAnswer(questionValues.get(7).trim());
        }
        return question;
    }
}
