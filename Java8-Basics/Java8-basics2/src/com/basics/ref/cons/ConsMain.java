package com.basics.ref.cons;

public class ConsMain {

	public static void main(String[] args) {
		
		System.out.println("we are studying contsructor refrence");

		IStudent iStudent=()->{
			return new Student();
		};
		
		Student student= iStudent.getStudent();
		student.display("Shreya","Seventh");
	}

}
