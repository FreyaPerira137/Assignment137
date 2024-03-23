package Question4;

import static org.junit.Assert.*;

import org.junit.Test;

import Question1.Q1;

public class Q4Test {

	Q4 q = new Q4();
	
	@Test
	public void test1() {
		int result = q.countNo(123);
		assertEquals(3,result);
	}
	
	@Test
	public void test2() {
		int result = q.countNo(-6789);
		assertEquals(4,result);
	}
}
