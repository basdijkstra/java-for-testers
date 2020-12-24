package examples;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CalculatorExceptionTest {

    @Test(expected = ArithmeticException.class)
    public void divideByZero_shouldThrowArithmeticException() {

        // Arrange - Create a new calculator and add 5
        Calculator calc = new Calculator();
        calc.add(5);

        // Act - try to divide by zero
        calc.divide(0);
    }

    @Test
    public void divideByZero_checkExceptionDetails() {

        // Arrange - Create a new calculator and add 5
        Calculator calc = new Calculator();
        calc.add(5);

        // Act - try to divide by zero
        ArithmeticException ae =
                Assert.assertThrows(ArithmeticException.class, () -> calc.divide(0));

        Assert.assertEquals("You tried to divide by zero!", ae.getMessage());
    }
}
