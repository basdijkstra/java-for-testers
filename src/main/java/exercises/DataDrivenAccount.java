package exercises;

import answers.AccountType;

public class DataDrivenAccount {

    private int balance;
    private int accountNumber;
    private AccountType accountType;

    public DataDrivenAccount(int balance, int accountNumber, AccountType accountType) {

        this.balance = balance;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
    }

    public DataDrivenAccount() {

        this.balance = 0;
        this.accountNumber = (int) (Math.random() * (100000 - 10000)) + 10000;
        this.accountType = AccountType.CHECKING;
    }

    public int getBalance() {

        return this.balance;
    }

    public void deposit(int amountToDeposit) {

        this.balance += amountToDeposit;
    }

    public void withdraw(int amountToWithdraw) {

        if (amountToWithdraw > this.balance && this.accountType.equals(AccountType.SAVINGS)) {
            throw new ArithmeticException("You cannot overdraw on a savings account!");
        }
        this.balance -= amountToWithdraw;
    }

    public String toString() {

        return String.format("The account with number %d is of type '%s' and has a balance of %d",
                this.accountNumber, this.accountType, this.balance);
    }
}
