package answers;

import org.junit.*;
import org.junit.rules.ExpectedException;

public class CalculatorTest {

    @Test
    public void add5_checkTotal_shouldBe5() {

        // Arrange - create a calculator
        Calculator calculator = new Calculator();

        // Act - add 5
        calculator.add(5);

        // Assert - check that the new total is 5
        Assert.assertEquals(5, calculator.getTotal());
    }

    @Test
    public void subtract4_checkTotal_shouldBeMinus4() {

        // Arrange - create a calculator
        Calculator calculator = new Calculator();

        // Act - subtract 4
        calculator.subtract(4);

        // Assert - check that the new total is -4
        Assert.assertEquals(-4, calculator.getTotal());
    }

    @Test
    public void multiplyBy9_checkTotal_shouldBe0() {

        // Arrange - create a calculator
        Calculator calculator = new Calculator();

        // Act - multiply by 9
        calculator.multiplyBy(9);

        // Assert - check that the new total is 0
        Assert.assertEquals(0, calculator.getTotal());
    }

//    @Test(expected = Exception.class)
//    public void withdraw1100FromAccount_shouldThrowBanana() throws Exception {
//
//        // Arrange - create a new account with a balance of 1000
//        Calculator calculator = new Calculator(1000);
//
//        // Act - withdraw 1100
//        calculator.withdraw(1100);
//    }
//
//    @Rule
//    public ExpectedException exceptionRule = ExpectedException.none();
//
//    @Test
//    public void withdraw1100FromAccount_shouldThrowException() throws Exception {
//
//        exceptionRule.expect(Exception.class);
//        exceptionRule.expectMessage("Insufficient funds: could not withdraw 1100 from this account");
//
//        // Arrange - create a new account with a balance of 1000
//        Calculator calculator = new Calculator(1000);
//
//        // Act - withdraw 1100
//        calculator.withdraw(1100);
//
//        // Assert
//        // TODO: make this test pass by specifying that you expect an exception
//        // TODO: bonus points for also asserting that the Exception message is "Insufficient funds: could not withdraw 1100 from this account"
//        // See https://www.baeldung.com/junit-assert-exception, bullet point 3. for an example
//    }
}
