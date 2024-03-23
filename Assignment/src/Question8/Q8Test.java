package Question8;

import static org.junit.Assert.*;

import org.junit.Test;

public class Q8Test {

	@Test
	public void test() {
		Q8 q1 = new Q8("John","Software Developer",50000);
		assertEquals(5000,q1.calculateSalary()-q1.basicSalary()-5000,0.001);
	}

}
