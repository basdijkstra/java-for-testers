package exercises;

import org.junit.*;

public class DataDrivenOldAccountTest {

    private OldAccount oldAccount;

    @Before
    public void createAccount() {

        oldAccount = new OldAccount(1000);
    }

    @Test
    public void withdraw500FromAccount_shouldResultInCorrectBalance() throws Exception {

        // Act - withdraw 500
        oldAccount.withdraw(500);

        // Assert - check that the remaining balance is 500
        Assert.assertEquals(500, oldAccount.getBalance());
    }

    @Test
    public void withdraw999FromAccount_shouldResultInCorrectBalance() throws Exception {

        // Act - withdraw 999
        oldAccount.withdraw(999);

        // Assert - check that the remaining balance is 1
        Assert.assertEquals(1, oldAccount.getBalance());
    }

    @Test
    public void withdraw1000FromAccount_shouldResultInCorrectBalance() throws Exception {

        // Act - withdraw 1000
        oldAccount.withdraw(1000);

        // Assert - check that the remaining balance is 0
        Assert.assertEquals(0, oldAccount.getBalance());
    }
}
