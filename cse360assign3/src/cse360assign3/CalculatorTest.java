package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void testCalculator(){
		Calculator calc = new Calculator();
		assertNotNull(calc);
	}
	
	@Test
	public void testTotal(){
		//fail();
		Calculator calc = new Calculator();
		assertEquals(0, calc.getTotal());	//initial condition should be 0
		calc.add(5);
		calc.add(100);
		calc.add(1234);
		assertEquals(1339, calc.getTotal());
		calc.add(-2000);
		assertEquals(-661, calc.getTotal()); //test to see if negative totals work
		
	}
	
	@Test
	public void testAdd(){
		//fail();
		Calculator calc = new Calculator();
		calc.add(4);
		calc.add(3);
		calc.add(2);
		assertEquals(9, calc.getTotal());
		calc.add(20);
		calc.add(-4);
		calc.add(-5);
		assertEquals(20, calc.getTotal());
	}
	
	@Test
	public void testSubtract(){
		//fail();
		Calculator calc = new Calculator();
		calc.subtract(3);
		calc.subtract(4);
		assertEquals(-7, calc.getTotal());
		calc.subtract(-3);
		calc.subtract(-4);
		assertEquals(0, calc.getTotal());
		calc.subtract(-20);
		calc.subtract(-8);
		calc.subtract(12);
		assertEquals(16, calc.getTotal());
	}
	
	@Test
	public void testMultiply(){
		//fail();
		Calculator calc = new Calculator();
		calc.multiply(6);
		assertEquals(0, calc.getTotal());
		calc.add(3);
		calc.multiply(3);
		assertEquals(9, calc.getTotal());
		calc.multiply(-2);
		assertEquals(-18, calc.getTotal());
		calc.multiply(0);
		assertEquals(0, calc.getTotal());
	}
	
	@Test
	public void testDivide(){
		//fail();
		Calculator calc = new Calculator();
		calc.divide(0);
		assertEquals(0, calc.getTotal());
		calc.add(20);
		calc.divide(0);
		assertEquals(0, calc.getTotal());
		calc.add(48);
		calc.divide(6);
		assertEquals(8, calc.getTotal());
		calc.divide(2);
		assertEquals(4, calc.getTotal());
		calc.divide(-1);
		assertEquals(-4, calc.getTotal());
	}
	
	@Test
	public void testGetHistory(){
		//fail();
		Calculator calc = new Calculator();
		calc.add(4);
		calc.subtract(5);
		calc.multiply(5);
		calc.add(3);
		calc.divide(4);
		assertEquals("0 + 4 - 5 * 5 + 3 / 4", calc.getHistory());
		calc.divide(0);
		calc.add(-5);
		calc.subtract(-10);
		assertEquals("0 + 4 - 5 * 5 + 3 / 4 / 0 + -5 - -10", calc.getHistory());
		
	}

}