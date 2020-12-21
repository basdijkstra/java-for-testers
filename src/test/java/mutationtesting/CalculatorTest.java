package mutationtesting;

import org.junit.*;

public class CalculatorTest {
	
	@Test
	public void testAddition() {
		
		Calculator calculator = new Calculator();
		calculator.add(2);
		Assert.assertEquals(2, calculator.getResult());
	}
	
	@Test
	public void testPower() {
		
		Calculator calculator = new Calculator(2);
		calculator.power(3);
		Assert.assertEquals(8, calculator.getResult());
	}
	
	@Test
	public void testConditionalSetTrue() {
		
		Calculator calculator = new Calculator();
		Assert.assertTrue(calculator.setConditional(2, true));
	}
	
	@Test
	public void testConditionalSetFalse() {
		
		Calculator calculator = new Calculator();
		Assert.assertFalse(calculator.setConditional(3, false));
	}
}
