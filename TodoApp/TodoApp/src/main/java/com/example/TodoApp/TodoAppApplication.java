package com.example.TodoApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoAppApplication {

	public static void main(String[] args) {

		TodoAppApplication todo=(TodoAppApplication) SpringApplication.run(TodoAppApplication.class, args);
	}

}
