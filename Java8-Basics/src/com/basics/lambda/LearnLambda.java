package com.basics.lambda;

public class LearnLambda {

	public static void main(String[] args) {
		System.out.println("hello");
		LearnLambda learn1= new LearnLambda();
		
		MathOperation add = (Integer num1, Integer num2) -> num1 + num2;
		
		MathOperation sub = (Integer num1, Integer num2) -> num1 - num2;
		
		MathOperation div = (Integer num1, Integer num2) -> num1 / num2;
		
		MathOperation multiply = (Integer num1, Integer num2) -> num1 * num2;
		
		System.out.println("addition of two numbers 100, 50 = "+ learn1.operate(100, 50, add));
		System.out.println("addition of two numbers 100, 50 = "+ learn1.operate(100, 50, sub));
		System.out.println("addition of two numbers 100, 50 = "+ learn1.operate(100, 50, div));
		System.out.println("addition of two numbers 100, 50 = "+ learn1.operate(100, 50, multiply));

	}
	
	private Integer operate(Integer num1, Integer num2, MathOperation mathOperation)
	{
		return mathOperation.operation(num1, num2);
	}
}
