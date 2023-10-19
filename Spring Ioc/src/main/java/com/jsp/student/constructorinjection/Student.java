package com.jsp.student.constructorinjection;

public class Student { 
	
	int id; 
	String name; 
	String email; 

	Student(int id,String name, String email){ 
		this.id=id; 
		this.name=name; 
		this.email=email; 
		
	} 
	
	public void studentDetails() { 
		System.out.println(id); 
		System.out.println(name); 
		System.out.println(email);
	}
}
