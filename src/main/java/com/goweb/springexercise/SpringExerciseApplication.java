package com.goweb.springexercise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SpringExerciseApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringExerciseApplication.class, args);
    }

}
