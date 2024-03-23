package Question6;

import static org.junit.Assert.*;

import org.junit.Test;

public class Q6Test {

	@Test
	public void test() {
		Q6 p1 = new Q6("Riya",20);
		
		assertEquals("Riya",p1.getName());
		assertEquals(20,p1.getAge());
		
	}

}
