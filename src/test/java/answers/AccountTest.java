package answers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class AccountTest {

    @Test
    public void deposit10_checkBalance_shouldBe10() {

        // Arrange - create an account using the no-argument constructor
        Account account = new Account();

        // Act - deposit 10
        account.deposit(10);

        // Assert - check that the balance is 10
        Assertions.assertEquals(10, account.getBalance());
    }

    @Test
    public void deposit10_withdraw20_checkBalance_shouldBeMinus10() {

        // Arrange - create a checking account using the parameterized constructor
        Account account = new Account(34567, AccountType.CHECKING);

        // Act - deposit 10
        account.deposit(10);

        // Act - withdraw 20
        account.withdraw(20);

        // Assert - check that the balance is -10
        Assertions.assertEquals(-10, account.getBalance());
    }

    // ---------------------------------------------------------
    // ---------------------------------------------------------

    /* EXCEPTIONS */

    @Test
    public void overdrawFromSavingsAccount_shouldThrowArithmeticException() {

        Account account = new Account(123, AccountType.SAVINGS);

        Assertions.assertThrows(ArithmeticException.class, () -> account.withdraw(10));
    }

    @ParameterizedTest(name = "Withdrawing {0} from a savings account with balance 10 should result in balance {1}")
    @CsvSource({
            "0, 10",
            "5, 5",
            "10, 0"
    })
    public void withdrawFromSavinsAccount_checkBalance(int amountToWithdraw, int expectedBalance) {

        Account account = new Account(12345, AccountType.SAVINGS);

        account.deposit(10);

        account.withdraw(amountToWithdraw);

        Assertions.assertEquals(expectedBalance, account.getBalance());
    }
}
