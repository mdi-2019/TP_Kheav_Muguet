import static org.junit.Assert.*;

import org.junit.Test;

public class ClassiqueTest {

	@Test
	public void testAdd() {
		assert(Classique.add(0, 9)==9);
	}
	
	@Test
	public void testSub() {
		assert(Classique.sub(5, 2)==3);
	}
	
	@Test
	public void testMult() {
		assert(Classique.mult(2, 3)==6);
	}
	
	@Test
	public void testDiv() {
		assert(Classique.div(9, 3)==3);
	}
}
