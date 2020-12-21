package answers;

import org.junit.Assert;
import org.junit.Test;

public class AccountWithEnumTest {

    // Test for *** ENUM EXERCISE ***
    @Test
    public void testCreationOfAccountWithEnum() {

         AccountWithEnum accountWithEnum = new AccountWithEnum();
         Assert.assertEquals(accountWithEnum.getAccountType(), AccountType.CHECKING);
    }

    // Tests for *** CONDITIONALS EXERCISE ***
    @Test
    public void overdraw_forCheckingAccount_shouldSucceed() {

        AccountWithEnum accountWithEnum = new AccountWithEnum(100, 12345, AccountType.CHECKING);

        accountWithEnum.withdraw(150);

        Assert.assertEquals(-50, accountWithEnum.getBalance());
    }

    @Test
    public void withdraw_forSavingsAccount_shouldSucceed() {

        AccountWithEnum accountWithEnum = new AccountWithEnum(100, 12345, AccountType.SAVINGS);

        accountWithEnum.withdraw(50);

        Assert.assertEquals(50, accountWithEnum.getBalance());
    }

    @Test
    public void overdraw_forSavingsAccount_shouldNotSucceed() {

        AccountWithEnum accountWithEnum = new AccountWithEnum(100, 12345, AccountType.SAVINGS);

        accountWithEnum.withdraw(150);

        Assert.assertEquals(100, accountWithEnum.getBalance());
    }

    // Test for *** EXCEPTION EXERCISE ***
    @Test
    public void overdraw_forSavingsAccount_shouldThrowException() {

        AccountWithEnum accountWithEnum = new AccountWithEnum(100, 12345, AccountType.SAVINGS);

        Assert.assertThrows(ArithmeticException.class,
                () -> {accountWithEnum.withdraw(150);});
    }
}
