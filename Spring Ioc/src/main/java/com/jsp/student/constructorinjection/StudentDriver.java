package com.jsp.student.constructorinjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.jsp.employee.setterinjection.Employee;

public class StudentDriver { 
	
	public static void main(String[] args) {
		ClassPathResource classPathResource=new ClassPathResource("myspring.xml"); 
		
		BeanFactory beanFactory= new XmlBeanFactory(classPathResource); 
		
		Student student=(Student) beanFactory.getBean("mystudent"); 
		
		student.studentDetails();

	}

}
