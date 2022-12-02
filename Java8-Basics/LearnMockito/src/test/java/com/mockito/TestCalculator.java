package com.mockito;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

public class TestCalculator{
	Calculator c= null;
	CalculatorService service= Mockito.mock(CalculatorService.class);
	@Before	
	public void setUp() {
		c=new Calculator(service);
	}
	
	@Test
	public void testPerform()
	{
		when(service.add(110,40)).thenReturn(150);
		assertEquals(150, c.perform(110, 40));
	}
	
	@Test
	public void testPerform1()
	{
		when(service.sub(100,40)).thenReturn(60);
		assertEquals(60, c.perform1(100, 40));
	}
	
	@Test
	public void testPerform2()
	{
		when(service.multiply(100,2)).thenReturn(200);
		assertEquals(200, c.perform2(100, 2));
	}
}
