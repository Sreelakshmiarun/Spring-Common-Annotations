package com.example.demo.model;

//import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class CollegeMain {

	public static void main(String[] args) {

		//ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class); //here, we change class because we removed the beans.xml
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);  //If you used above line, you need to typecast process
		College college = context.getBean("college", College.class);
		System.out.println("Bean was readed " + college);
		college.arun();
	    context.close();          //Closing Container

	}

}
