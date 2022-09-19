package com.example.Spring1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Spring1Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring1Application.class, args);
	}

	@Bean
CommandLineRunner commandLineRunner(StudentRepository studentRepository){
		return args -> {
			Students saleh = new Students(
					"saleh",
					"Allahverdiyev",
					"sallahverdiyev2@std.beu.edu.az",
					18

			);
			studentRepository.save(saleh);
		};
}
}
