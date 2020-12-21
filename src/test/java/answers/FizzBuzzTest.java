package answers;

import org.junit.Test;

public class FizzBuzzTest {

// FizzBuzz time! This is a classic programming challenge.
// Write a function fizzbuzz() that prints the numbers from
// 1 to 100 to the console output, but:
//   - If the number can be divided by 3, print "Fizz"
//   - If the number can be divided by 5, print "Buzz"
//   - If the number can be divided by 3 AND by 5, print "FizzBuzz"

    @Test
    public void fizzBuzzTest() {

        int count = 1;
        while(count <= 100) {

            if (count % 15 == 0) {
                System.out.println("FizzBuzz");
            }
            else if (count % 5 == 0) {
                System.out.println("Buzz");
            }
            else if (count % 3 == 0) {
                System.out.println("Fizz");
            }
            else {
                System.out.printf("%d\n", count);
            }

            count++;
        }

    }
}
