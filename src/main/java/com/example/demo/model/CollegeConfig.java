package com.example.demo.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration                                          // here, we configure the xml config, so we don't need beans.xml configuration
@ComponentScan(basePackages = "com.example.demo.model") // here, we tell the which packages to check for object creation. If we used @Bean annotation for object creation, we don't need @componentscan annotion.... 
@PropertySource("college-info.properties")	            // here, we mention the file name of prpperties file.If you have multiple properties files, use @propertySources annotaion.
public class CollegeConfig {

	
//	 @Bean(name = {"collegeBean","colBean"})             // This annotation will created the object for COllege class in IOC container. So we don't need to @component annotation for college class.  // we can give id names in @Bean,Like. @Bean(name = {"collegeBean","colBean"}). Also we can give multiple id names.
	                                                                                          
//	  public College collegeBean() {                      //Here, collegeBean is the BeanId
//	  //College college = new College();
//	   //return college;
//	//return new College();	                                       //above 2 lines is equivalent to this line }
//	//  return new College(principals());                        //this line required for if we are using constructor for dependency                         
//	  College college = new College();
//	  college.setPrincipal(principals());                     //If you using setter method for dependencies, using this line for dependency bean id mention.
//		college.setTeacher(tamilTeacher());  
//	  return  college;
//	  }
	  
//	  @Bean
//	  public Principal principals() {
		  
//		  return new Principal();
//	  }
	  
//	  @Bean
//	  public Teacher tamilTeacher() {
		  
//		 TamilTeacher tamil = new TamilTeacher();    //here, We can't create the object for Interface. Only interface implemented class will be applied for object creation.  
//		 return tamil;
			
	
		  
//	  }


        
}