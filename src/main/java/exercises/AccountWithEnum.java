package exercises;

public class AccountWithEnum {

    // *** ENUM EXERCISE ***
    // Change the data type of the accountType property to the AccountType enum you defined

    private int balance;
    private int accountNumber;
    private String accountType;

    // *** ENUM EXERCISE ***
    // Change the constructor so it takes the correct data type for the accountType property

    public AccountWithEnum(int balance, int accountNumber, String accountType) {

        this.balance = balance;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
    }

    // *** ENUM EXERCISE ***
    // Change the default value for the accountType property to the CHECKING enum value

    public AccountWithEnum() {

        this.balance = 0;
        this.accountNumber = (int) (Math.random() * (100000 - 10000)) + 10000;
        this.accountType = "checking";
    }

    // *** ENUM EXERCISE ***
    // Change the implementation of this method so that it returns the new enum data type

    public String getAccountType() {

        return this.accountType;
    }

    public int getBalance() {

        return this.balance;
    }

    public void deposit(int amountToDeposit) {

        this.balance += amountToDeposit;
    }

    // *** CONDITIONALS EXERCISE ***
    // Change the implementation of the withdraw() method so that:
    // - If the account type is equal to 'CHECKING', the amount is always withdrawn (unlimited overdraw)
    // - If the account type is equal to 'SAVINGS', the amount is only withdrawn
    //   if it is not larger than the current balance

    // ** EXCEPTION EXERCISE **
    // Change the implementation of the withdraw() method so that it throws an ArithmeticException
    // when you try to overdraw on a savings account. The exception message should be equal to
    // 'Cannot withdraw <amount> from a savings account with balance <balance>'.


    public void withdraw(int amountToWithdraw) {

        this.balance -= amountToWithdraw;
    }

    public String toString() {

        return String.format("The account with number %d is of type '%s' and has a balance of %d",
                this.accountNumber, this.accountType, this.balance);
    }
}
