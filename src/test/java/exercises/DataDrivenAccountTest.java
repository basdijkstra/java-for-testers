package exercises;

import answers.AccountType;
import org.junit.*;

public class DataDrivenAccountTest {

    @Test
    public void withdraw500FromAccount_shouldResultInCorrectBalance() {

        // Arrange - create a new savings account with an initial balance of 1000
        DataDrivenAccount account = new DataDrivenAccount(1000, 12345, AccountType.SAVINGS);

        // Act - withdraw 500
        account.withdraw(500);

        // Assert - check that the remaining balance is 500
        Assert.assertEquals(500, account.getBalance());
    }

    @Test
    public void withdraw999FromAccount_shouldResultInCorrectBalance() {

        // Arrange - create a new savings account with an initial balance of 1000
        DataDrivenAccount account = new DataDrivenAccount(1000, 12345, AccountType.SAVINGS);

        // Act - withdraw 999
        account.withdraw(999);

        // Assert - check that the remaining balance is 1
        Assert.assertEquals(1, account.getBalance());
    }

    @Test
    public void withdraw1000FromAccount_shouldResultInCorrectBalance() {

        // Arrange - create a new savings account with an initial balance of 1000
        DataDrivenAccount account = new DataDrivenAccount(1000, 12345, AccountType.SAVINGS);

        // Act - withdraw 1000
        account.withdraw(1000);

        // Assert - check that the remaining balance is 0
        Assert.assertEquals(0, account.getBalance());
    }
}
