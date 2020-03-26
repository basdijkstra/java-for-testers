package exercises;

import org.junit.*;
import org.junit.rules.ExpectedException;

public class AccountTest {

    @Test
    public void withdraw500FromAccount_shouldBeAllowed() throws Exception {

        // Arrange - create a new account with a balance of 1000
        Account account = new Account(1000);

        // Act - withdraw 500
        account.withdraw(500);

        // Assert - check that the remaining balance is 500
        // TODO: add an assertion that checks whether the remaining balance is equal to 500
    }

    @Test
    public void deposit500ToAccount_shouldResultInCorrectBalance() {

        // Arrange - create a new account with a balance of 1000
        // TODO: create a new instance of the Account class with a balance of 1000

        // Act - deposit 500
        // TODO: add a call to the deposit() method to deposit 500

        // Assert - check that the new balance is 1500
        // TODO: add an assertion to check that the new balance is equal to 1500
    }

    @Rule
    public ExpectedException ee = ExpectedException.none();

    @Test
    public void withdraw1100FromAccount_shouldThrowException() {

        ee.expect(Exception.class);
        ee.expectMessage("Insufficient funds: could not withdraw 1100 from this account");

        // Arrange - create a new account with a balance of 1000
        // TODO: create a new instance of the Account class with a balance of 1000
        Account account = new Account(1000);

        // Act - withdraw 1100
        // TODO: add a call to the withdraw() method to withdraw 1100
        account.withdraw(1100);

        // Assert
        // TODO: make this test pass by specifying that you expect an exception
        // TODO: bonus points for also asserting that the Exception message is "Insufficient funds: could not withdraw 1100 from this account"
        // See https://www.baeldung.com/junit-assert-exception, bullet point 3. for an example
    }
}
