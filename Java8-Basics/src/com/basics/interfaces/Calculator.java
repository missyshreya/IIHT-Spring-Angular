package com.basics.interfaces;

interface Add{
	void add();
	static Integer A(Integer x, Integer y) {return x+y;};
	
}

interface Sub{
	void sub();
	static Integer S(Integer x, Integer y) {return x-y;};
	
}

interface Div{
	void div();
	static Integer D(Integer x, Integer y) {return x/y;};
	
}

interface Mul{
	void mul();
	static Integer M(Integer x, Integer y) {return x*y;};
	
}

public class Calculator {
	public static void main(String[]args){
		Add s1= new adding();
		s1.add();
		System.out.println(Add.A(200, 10));
		Sub s2= new subtracting();
		s2.sub();
		System.out.println(Sub.S(200, 10));
	}
}

class adding implements Add {
	
	@Override
	public void add()
	{
		System.out.println("Addition is:");
	}
}

class subtracting implements Sub {
	
	@Override
	public void sub()
	{
		System.out.println("Subtraction is:");
	}
}

