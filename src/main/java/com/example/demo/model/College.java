package com.example.demo.model;

import java.util.jar.Attributes.Name;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component                                                                    //@Component annotation create the object for this class as your mentioned bean id.If you don't give id name sping is defaultly taking bean id is small letter of class name,Like 'College' is class name, spring take id name is 'college'
public class College {

	//@Value("${college.name}")                                               //Commanded for @Required annoation
	private String collegeName;
	
    @Autowired                                                                //If we using @component annotation for dependency classes and intefaces, that only create the objects in container for mentioned classes and interface.So we need @Autowired annotation for inject the properties of needed dependency.  
	public Principal principal;                                               // here, we give one dependancy so we need to create the object in container
   
    @Autowired                                                                //If we using @component annotation for dependency classes and intefaces, that only create the objects in container for mentioned classes and interface.So we need @Autowired annotation for inject the properties of needed dependency.  
    @Qualifier("englishTeacher")                                              //here,If we have more than implementation classes for one interface, we can use @primary annotation for implementation class in method level or using @Required annotaion for main class and mention needed implementation class name. 
    public Teacher teacher;
	
    
    
	/*
	 * public College(Principal principal) { this.principal = principal; }    //This is constructor for principal class 
	 */
	
//	public void setPrincipal(Principal principal) {                           //This is Setter for principal class
//		this.principal = principal;
//	}                                                        //*Here, we used @Autowired annotation, so we don't need setter and constructors                 
	

//	public void setTeacher(Teacher teacher) {                                 //This is setter method for Teacher Interface
//		this.teacher = teacher;
//	}

    @Autowired
    @Required
    @Value("${college.name}")
	public void setCollegeName(String collegeName) {                            //Setter method for collegeName and purpose for @Required annotaion
		this.collegeName = collegeName;
	}



	public void arun() {
		principal.princi();
		teacher.teach();
		System.out.println("Our College name is: "+collegeName);
		System.out.println("This program is working fine");
	}

	
}
