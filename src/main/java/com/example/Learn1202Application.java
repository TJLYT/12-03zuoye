package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.service.EmpService;


@SpringBootApplication
public class Learn1202Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Learn1202Application.class, args);
	  EmpService es = context.getBean(EmpService.class);
		 
	// es.insertEmp(1, "liu", 8000, 1);
	  //es.findEmp(1);
	 
	}
}
