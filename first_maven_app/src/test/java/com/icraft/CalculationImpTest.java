package com.icraft;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class CalculationImpTest {
	
	Calculator calc = new CalculationImp();
	

	@Test
	public void testAdd() {

		Assert.assertEquals(calc.add(10, 10), 20);
		
	}
		
		public void testsub() {
		Assert.assertEquals(calc.sub(10, 10), 0);
		
		}
		
		public void testmulti() {
		Assert.assertEquals(calc.multi(10, 10), 100);
		
		}
		
		public void testdiv() {
		Assert.assertEquals(calc.div(10, 10), 1.0);
			
		}
	}


