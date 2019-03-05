import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class ScientifiqueTest {

	@Test
	public void testCos() {
		Assert.assertEquals(Math.cos(5), Scientifique.cos(5), 0.001);
	}
	
	@Test
	public void testSin() {
		Assert.assertEquals(Math.sin(8), Scientifique.sin(8), 0.001);
	}
	
	@Test
	public void testPow() {
		Assert.assertEquals(Math.pow(7, 5), Scientifique.pow(7,5), 0.001);
	}

}
