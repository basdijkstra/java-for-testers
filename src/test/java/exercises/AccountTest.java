package exercises;

import exercises.AccountWithEnum;
import org.junit.Assert;
import org.junit.Test;

public class AccountTest {

    @Test
    public void testAnArrayOfAccounts() {

        Account myAccount = new Account();
        myAccount.anArrayOfAccounts();
    }

    @Test
    public void testAListOfAccounts() {

        Account myAccount = new Account();
        myAccount.aListOfAccounts();
    }

    @Test
    public void testCreationOfAccountWithEnum() {

        // AccountWithEnum accountWithEnum = new AccountWithEnum();
        // Assert.assertEquals(accountWithEnum.getAccountType(), AccountType.CHECKING);
    }
}
