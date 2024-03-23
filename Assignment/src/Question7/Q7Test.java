package Question7;

import static org.junit.Assert.*;

import org.junit.Test;

import Question6.Q6;

public class Q7Test {

	@Test
	public void test() {
		Q7 p1 = new Q7("Buddy","Labrador");
		
		assertEquals("Buddy",p1.getName());
		assertEquals("Labrador",p1.getBreed());
		
		p1.setName("Rocky");
		p1.setBreed("Golden Retriever");
		assertEquals("Rocky",p1.getName());
		assertEquals("Golden Retriever",p1.getBreed());
	}

}
