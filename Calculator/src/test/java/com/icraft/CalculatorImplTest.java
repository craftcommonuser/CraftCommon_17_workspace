package com.icraft;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorImplTest {
Calculator calc= new CalculatorImpl();
	@Test
	public void testAddition() {
		Assert.assertEquals(calc.addition(10,10), 20);
	}

	@Test
	public void testSubtruction() {
		Assert.assertEquals(calc.subtruction(10,10), 0);
	}

	@Test
	public void testDivision() {
		Assert.assertEquals(calc.division(10,10), 1);
	}

	@Test
	public void testMultiplication() {
		Assert.assertEquals(calc.multiplication(10,10), 100);
	}

}
