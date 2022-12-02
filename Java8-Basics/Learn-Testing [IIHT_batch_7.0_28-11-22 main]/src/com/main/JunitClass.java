package com.main;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class JunitClass {
	
	String username="Nishant123";
	@Test
	public void testUserName() {
		System.out.println("Testing if username matches ");
		assertEquals("Nishant123", username);
	}

	@Test
	public void JunitMethod() {
		System.out.println("Test file executed");
	}
	public static void main(String[] args) {
		JunitClass results= new JunitClass();
		results.testUserName();
		
	}

}
