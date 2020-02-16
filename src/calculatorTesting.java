import static org.junit.Assert.*;

import org.junit.Test;

public class calculatorTesting {

	@Test
	public void test() {
		assertEquals(5,Calculator.Add(2, 3));
		assertEquals(4,Calculator.sub(8, 4));
		assertEquals(3,Calculator.mul(3, 1));
		assertEquals(4,Calculator.div(16, 4),0);
		
	}

}
