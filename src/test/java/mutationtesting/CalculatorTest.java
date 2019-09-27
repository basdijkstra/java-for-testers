package mutationtesting;

import org.junit.*;

public class CalculatorTest {
	
	@Test
	public void testAddition() {
		
		Calculator calculator = new Calculator();
		calculator.add(2);
		Assert.assertEquals(calculator.getResult(), 2);
	}
	
	@Test
	public void testPower() {
		
		Calculator calculator = new Calculator(2);
		calculator.power(3);
		Assert.assertEquals(calculator.getResult(), 8);
	}
	
	@Test
	public void testConditionalSetTrue() {
		
		Calculator calculator = new Calculator();
		Assert.assertEquals(calculator.setConditional(2, true), true);
	}
	
	@Test
	public void testConditionalSetFalse() {
		
		Calculator calculator = new Calculator();
		Assert.assertEquals(calculator.setConditional(3, false), false);
	}
}
