package br.edu.uniritter;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.edu.uniritter.examples.Calculator;

public class CalculatorTest {

	private Calculator c;

	@Before
	public void setUp() {
		c = new Calculator(1,1);
	}
	@Test
	public void testAdd() {
		assertEquals(2,c.add(),0);
	}

	@Test
	public void testSub() {
		assertEquals(0,c.sub(),0);
	}

	@Test
	public void testMult() {
		assertEquals(1,c.mult(),0);
	}

	@Test
	public void testDiv() {
		
		assertEquals(1,c.div(),0.1);
	}

	@Test
	public void testFact() {
		double x = c.fact();
		assertEquals(x,24,0.1);
	}

	
}
