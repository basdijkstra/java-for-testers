package answers;

import org.junit.*;
import org.junit.rules.ExpectedException;

public class OldAccountTest {

    @Test
    public void withdraw500FromAccount_shouldBeAllowed() throws Exception {

        // Arrange - create a new account with a balance of 1000
        OldAccount oldAccount = new OldAccount(1000);

        // Act - withdraw 500
        oldAccount.withdraw(500);

        // Assert - check that the remaining balance is 500
        Assert.assertEquals(500, oldAccount.getBalance());
    }

    @Test
    public void deposit500ToAccount_shouldResultInCorrectBalance() {

        // Arrange - create a new account with a balance of 1000
        OldAccount oldAccount = new OldAccount(1000);

        // Act - deposit 500
        oldAccount.deposit(500);

        // Assert - check that the new balance is 1500
        Assert.assertEquals(1500, oldAccount.getBalance());
    }

    @Test
    public void deDerdeMogelijkheid() {

        // Arrange - create a new account with a balance of 1000
        OldAccount oldAccount = new OldAccount(1000);

        try {
            // Act - withdraw 1100
            oldAccount.withdraw(1100);
            Assert.assertTrue("Test failed", false);
        }
        catch(Exception e) {
            Assert.assertTrue("Test passed", true);
        }
    }

    @Test(expected = Exception.class)
    public void withdraw1100FromAccount_shouldThrowBanana() throws Exception {

        // Arrange - create a new account with a balance of 1000
        OldAccount oldAccount = new OldAccount(1000);

        // Act - withdraw 1100
        oldAccount.withdraw(1100);
    }

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void withdraw1100FromAccount_shouldThrowException() throws Exception {

        exceptionRule.expect(Exception.class);
        exceptionRule.expectMessage("Insufficient funds: could not withdraw 1100 from this account");

        // Arrange - create a new account with a balance of 1000
        OldAccount oldAccount = new OldAccount(1000);

        // Act - withdraw 1100
        oldAccount.withdraw(1100);

        // Assert
        // TODO: make this test pass by specifying that you expect an exception
        // TODO: bonus points for also asserting that the Exception message is "Insufficient funds: could not withdraw 1100 from this account"
        // See https://www.baeldung.com/junit-assert-exception, bullet point 3. for an example
    }
}
