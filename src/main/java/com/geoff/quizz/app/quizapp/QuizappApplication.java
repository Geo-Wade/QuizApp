package com.geoff.quizz.app.quizapp;

import com.geoff.quizz.app.quizapp.services.Bootstrapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.io.IOException;

@SpringBootApplication
public class QuizappApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(QuizappApplication.class, args);
		Bootstrapper bootstrapper = applicationContext.getBean(Bootstrapper.class);
		try {
			bootstrapper.bootStrapQuestions();
		} catch (IOException e) {
			System.out.println("Unfortunately, this application has failed at the very opening stages.");
		}

	}


}
