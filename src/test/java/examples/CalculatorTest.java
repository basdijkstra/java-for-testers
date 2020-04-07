package examples;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testWithoutExceptionHandling() {

        Calculator calc = new Calculator();

        calc.add(5);

        calc.divideByWithoutExceptionHandling(0);
    }

    @Test
    public void testWithExceptionHandling() {

        Calculator calc = new Calculator();

        calc.add(5);

        calc.divideByWithExceptionHandling(0);
    }

    @Test
    public void testWithThrownException() {

        Calculator calc = new Calculator();

        calc.add(5);

        try {
            calc.divideByZeroThrowsException(1);
        }
        catch (ArithmeticException ae) {
            System.out.println("Method threw an exception");
        }
        finally {
            System.out.println("FINALLY");
        }
    }

    @Test(expected = ArithmeticException.class)
    public void testExpectException() {

        Calculator calc = new Calculator();

        calc.add(5);

        calc.divideByZeroThrowsException(0);
    }

}
