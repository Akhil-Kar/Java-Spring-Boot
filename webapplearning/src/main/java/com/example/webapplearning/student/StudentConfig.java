package com.example.webapplearning.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student akhil = new Student(
                    "Akhil",
                    "akhil@gmail.com",
                    LocalDate.of(2002, FEBRUARY, 5)
            );
            Student tushar = new Student(
                    "Tushar",
                    "tushar@gmail.com",
                    LocalDate.of(2001, MAY, 5)
            );
            Student shuvo = new Student(
                    "Shuvo",
                    "shuvo@gmail.com",
                    LocalDate.of(2000, JANUARY, 5)
            );

            repository.saveAll(
                    List.of(akhil, tushar, shuvo)
            );
        };
    }

}
