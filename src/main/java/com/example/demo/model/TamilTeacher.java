package com.example.demo.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component                     //Here, we implement the Teacher interface, so we gave the @component annotation for Teacher interface
/* @Primary */
public class TamilTeacher implements Teacher {

	@Override
	public void teach() {
		
		System.out.println("I'm your Tamil Teacher and My name is Arun...");
		
	}

}
