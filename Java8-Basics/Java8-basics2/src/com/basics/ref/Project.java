package com.basics.ref;

import java.time.LocalDate;

public class Project {

	public static void projectProgress() {
		System.out.println("Project is making progress");
		System.out.println("project approved by client");
		LocalDate now= LocalDate.now();
		System.out.println("on "+ now.toString());
	}
}
