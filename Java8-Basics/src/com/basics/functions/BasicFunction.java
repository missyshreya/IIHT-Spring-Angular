package com.basics.functions;

public class BasicFunction {

		public static void main(String args[])
		{
			System.out.println(Addition(12,23));
			System.out.println(Subtraction(20,12));
			System.out.println(Division(20,10));
			System.out.println(Multiplication(20,12));
			System.out.println(Square(2));
			System.out.println(Cube(2));
		}
		
		static Integer Addition(Integer num1, Integer num2)
		{
			return num1 + num2;
		}
		
		static Integer Subtraction(Integer num1, Integer num2)
		{
			return num1 - num2;
		}
		
		static Integer Division(Integer num1, Integer num2)
		{
			return num1 / num2;
		}
		
		static Integer Multiplication(Integer num1, Integer num2)
		{
			return num1 * num2;
		}
		
		static Integer Square(Integer num)
		{
			return num * num;
		}
		
		static Integer Cube(Integer num)
		{
			return num * num * num;
		}
}
