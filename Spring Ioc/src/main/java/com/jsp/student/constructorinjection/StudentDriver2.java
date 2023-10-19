package com.jsp.student.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDriver2 { 
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("myspring.xml"); 
		
		Student student=(Student) applicationContext.getBean("mystudent"); 
		student.studentDetails();
	}

}
