package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.first.MathOpperation;

public class TestMath {

	@Test
	public void test() {
		MathOpperation mo = new MathOpperation();
		int actual = mo.add(5,5);
		int expected = 10;
		
		assertEquals(actual, expected);
	}
	
	@Test
	public void test2() {
		MathOpperation mo = new MathOpperation();
		int actual = mo.sub(5,5);
		int expected = 0;
		
		assertEquals(actual, expected);
	}
	@Test
	public void test3() {
		MathOpperation mo = new MathOpperation();
		int actual = mo.mul(5,5);
		int expected = 25;
		
		assertEquals(actual, expected);
	}

}
