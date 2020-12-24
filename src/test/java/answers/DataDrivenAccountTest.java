package answers;

import com.tngtech.java.junit.dataprovider.*;
import org.junit.*;
import org.junit.runner.RunWith;

@RunWith(DataProviderRunner.class)
public class DataDrivenAccountTest {

    @Test
    @DataProvider({
            "500, 500",
            "999, 1",
            "1000, 0"
    })
    public void withdraw500FromAccount_shouldResultInCorrectBalance(int amountToWithdraw, int expectedBalanceAfterWithdrawal) {

        // Arrange - create a new savings account with an initial balance of 1000
        DataDrivenAccount account = new DataDrivenAccount(1000, 12345, AccountType.SAVINGS);

        // Act - withdraw 500
        account.withdraw(amountToWithdraw);

        // Assert - check that the remaining balance is equal to the expected value
        Assert.assertEquals(expectedBalanceAfterWithdrawal, account.getBalance());
    }
}