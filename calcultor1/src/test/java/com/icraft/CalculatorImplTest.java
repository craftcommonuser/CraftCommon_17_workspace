package com.icraft;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class CalculatorImplTest {
	Calculator calc=new CalculatorImpl();

	@Test
	public void testAdd() {
		Assert.assertEquals(calc.add(10,10), 20);
	}

	@Test
	public void testMulti() {
		Assert.assertEquals(calc.multi(10,10), 100);
	
	}

	@Test
	public void testSub() {
		Assert.assertEquals(calc.sub(10,10), 0);
	
	}

	@Test
	public void testDiv() {
		Assert.assertEquals(calc.div(10,10), 1);

	}

}
