package exercises;

import org.junit.*;

public class DataDrivenAccountTest {

    private Account account;

    @Before
    public void createAccount() {

        account = new Account(1000);
    }

    @Test
    public void withdraw500FromAccount_shouldResultInCorrectBalance() throws Exception {

        // Act - withdraw 500
        account.withdraw(500);

        // Assert - check that the remaining balance is 500
        Assert.assertEquals(500, account.getBalance());
    }

    @Test
    public void withdraw999FromAccount_shouldResultInCorrectBalance() throws Exception {

        // Act - withdraw 999
        account.withdraw(999);

        // Assert - check that the remaining balance is 1
        Assert.assertEquals(1, account.getBalance());
    }

    @Test
    public void withdraw1000FromAccount_shouldResultInCorrectBalance() throws Exception {

        // Act - withdraw 1000
        account.withdraw(1000);

        // Assert - check that the remaining balance is 0
        Assert.assertEquals(0, account.getBalance());
    }
}
