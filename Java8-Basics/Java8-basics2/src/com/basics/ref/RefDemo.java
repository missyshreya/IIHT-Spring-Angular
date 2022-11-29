package com.basics.ref;

public class RefDemo {

	public static void main(String[] args) {
		System.out.println("Method reference demo");

		//provide the implementation of IWork
		
		/*IWork iWork= () -> {
			System.out.println("This is doproject from IWork");
		};*/
		
		IWork iWork = Project::projectProgress;
		
		// :: is used to refer methods
		//we are referencing the method projectProgress from some other class Project and not calling it
		
		iWork.doProject();
		
		/*Runnable runnable= Project::threadTask;
		Thread t1= new Thread(runnable);
		t1.start();*/
		
		Runnable runnable= Project::oddNumberPrinter;
		Thread t1= new Thread(runnable);
		t1.start();
		
		
	}

}
