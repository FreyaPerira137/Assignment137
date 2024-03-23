package Question1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Q1Test {

	Q1 q = new Q1();
	
	@Test
	public void testsum1() {
		int result = q.add(9, 5);
		assertEquals(14,result);
	}
	
	@Test
	public void testsum2() {
		int result = q.add(-5, 3);
		assertEquals(-2,result);
	}

}
