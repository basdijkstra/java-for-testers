package answers;

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
        Assert.assertEquals(500, account.getBalance());
    }

    @Test
    public void deposit500ToAccount_shouldResultInCorrectBalance() {

        // Arrange - create a new account with a balance of 1000
        Account account = new Account(1000);

        // Act - deposit 500
        account.deposit(500);

        // Assert - check that the new balance is 1500
        Assert.assertEquals(1500, account.getBalance());
    }

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void withdraw1100FromAccount_shouldThrowException() throws Exception {

        exceptionRule.expect(Exception.class);
        exceptionRule.expectMessage("Insufficient funds: could not withdraw 1100 from this account");

        // Arrange - create a new account with a balance of 1000
        Account account = new Account(1000);

        // Act - withdraw 1100
        account.withdraw(1100);

        // Assert
        // TODO: make this test pass by specifying that you expect an exception
        // TODO: bonus points for also asserting that the Exception message is "Insufficient funds: could not withdraw 1100 from this account"
        // See https://www.baeldung.com/junit-assert-exception, bullet point 3. for an example
    }
}
