package com.example.springbootjpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootjpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootjpaApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
		Student akhil = new Student(
				"Akhil",
				"Kar",
				"akhil@gmail.com",
				20
		);
		return args -> {
			studentRepository.save(akhil);
		};
	}

}
