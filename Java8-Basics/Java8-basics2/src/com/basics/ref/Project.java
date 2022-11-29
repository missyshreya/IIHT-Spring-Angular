package com.basics.ref;

import java.time.LocalDate;

public class Project {

	public static void projectProgress() {
		System.out.println("Project is making progress");
		System.out.println("project approved by client");
		LocalDate now= LocalDate.now();
		System.out.println("on "+ now.toString());
	}
	
	public static void threadTask() {
		for(int i=1;i<=10;i++) {
			System.out.println(i*2);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void oddNumberPrinter() {
		for(int i=1;i<=100;i++) {
			if (i%2!=0)
					System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
