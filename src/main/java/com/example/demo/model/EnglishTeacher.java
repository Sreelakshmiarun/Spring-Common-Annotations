package com.example.demo.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
/* @Primary */
public class EnglishTeacher implements Teacher{

	@Override
	public void teach() {
		System.out.println("I'm your English Teacher and my name is SreeLakshmi");
		
	}

}
