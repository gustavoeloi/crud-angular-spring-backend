package com.gustavooeloi.crudspring;

import com.gustavooeloi.crudspring.model.Course;
import com.gustavooeloi.crudspring.repository.CourseRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudSpringApplication {

	public static void main(String[] args) {

		SpringApplication.run(CrudSpringApplication.class, args);
	}

	@Bean
	CommandLineRunner initDataBase(CourseRepository courseRepository) {
		return args -> {
				courseRepository.deleteAll();
				Course c = new Course();
				c.setName("Angular com Spring");
				c.setCategory("Full-Stack");

				courseRepository.save(c);
		};
	}
}
