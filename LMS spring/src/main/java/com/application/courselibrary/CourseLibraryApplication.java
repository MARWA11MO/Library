package com.application.courselibrary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class CourseLibraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseLibraryApplication.class, args);
	}

		}
