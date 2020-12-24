package exercises;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void add5_checkTotal_shouldBe5() {

        // Arrange - create a calculator
        Calculator calculator = new Calculator();

        // Act - add 5
        calculator.add(5);

        // Assert - check that the new total is 5
        // TODO: add an assertion that checks that the new total is equal to 5
    }

    @Test
    public void subtract4_checkTotal_shouldBeMinus4() {

        // Arrange - create a calculator
        // TODO: create a new Calculator object

        // Act - subtract 4
        // TODO: subtract 4

        // Assert - check that the new total is -4
        // TODO: check that the new total equals -4
    }

    // TODO: Add a third test method that does the following:
    //       - create a new Calculator object
    //       - multiply the current value by 9
    //       - check that the new total equals 0
}
