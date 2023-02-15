package com.icraft;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class CalculatorImplTest  {
	Calculator Calc =new CalculatorImpl();

	@Test
	public void testAdd() {
	Assert.assertEquals(Calc.add(10, 10),20);
	}

	@Test
	public void testMulti() {
		Assert.assertEquals(Calc.multi(10, 10), 100);
	}

	@Test
	public void testSub() {
		Assert.assertEquals(Calc.sub(10, 10), 0);
	}

	@Test
	public void testDiv() {
		Assert.assertEquals(Calc.div(10, 10), 1.0); 
	}

}