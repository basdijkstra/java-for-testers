package answers;

import com.tngtech.java.junit.dataprovider.*;
import exercises.Account;
import org.junit.*;
import org.junit.runner.RunWith;

@RunWith(DataProviderRunner.class)
public class DataDrivenAccountTest {

    private Account account;

    @DataProvider
    public static Object[][] accountTestData() {
        return new Object[][] {
            {500, 500},
            {999, 1},
            {1000, 0}
        };
    }

    @Before
    public void createAccount() {

        account = new Account(1000);
    }

    @Test
    @UseDataProvider("accountTestData")
    public void withdraw500FromAccount_shouldResultInCorrectBalance(int amountToWithdraw, int expectedBalanceAfterWithdrawal) throws Exception {

        // Act - withdraw 500
        account.withdraw(amountToWithdraw);

        // Assert - check that the remaining balance is 500
        Assert.assertEquals(expectedBalanceAfterWithdrawal, account.getBalance());
    }
}