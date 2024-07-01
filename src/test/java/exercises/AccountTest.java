package exercises;

import answers.Account;
import answers.AccountType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AccountTest {

    @Test
    public void deposit10_checkBalance_shouldBe10() {

        // Arrange - create an account using the no-argument constructor
        answers.Account account = new answers.Account();

        // Act - deposit 10
        account.deposit(10);

        // Assert - check that the balance is 10
        // TODO: write the assertion and run the test to see if it passes
    }

    @Test
    public void deposit10_withdraw20_checkBalance_shouldBeMinus10() {

        // Arrange - create a checking account using the parameterized constructor
        // TODO: create the account

        // Act - deposit 10
        // TODO: deposit 10 into the account

        // Act - withdraw 20
        // TODO: withdraw 20 from the account

        // Assert - check that the balance is -10
        // TODO: check that the resulting balance of the account is -10
    }

    // ---------------------------------------------------------
    // ---------------------------------------------------------

    /* EXCEPTIONS */

    // TODO: write a test that create a new savings account and then immediately tries to
    //   withdraw 10 from it. This should throw an exception, but does it? Write the test!

    /* PARAMETERIZED TEST */

    // TODO: Write a parameterized test that tests the withdraw function for a savings account
    // For all iterations: create a new savings account and deposit 10.
    // Iteration 1: withdraw 0, check that balance is 10
    // Iteration 2: withdraw 5, check that balance is 5
    // Iteration 3, withdraw 10, check that balance is 0

}
