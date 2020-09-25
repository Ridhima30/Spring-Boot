package io.javabrains.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//to tell spring this is a spring app
// annotation for this 
@SpringBootApplication
public class CourseApiApp {
	// in this file we will bootstrap a Spring application
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//the code set up app, start the servlet container, host app in that container
		SpringApplication.run(CourseApiApp.class, args);	
		
	}

}
