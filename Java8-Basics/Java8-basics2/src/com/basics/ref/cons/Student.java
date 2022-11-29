package com.basics.ref.cons;

public class Student {
	
	public Student() {
		System.out.println("Creating object of student class");
	}
	
	public void display(String name, String standard) {
		System.out.println("The student name is : " + name);
		System.out.println("This is a student!");
		System.out.println("The student standard is : "+standard);
	}
}
