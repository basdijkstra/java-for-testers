package answers;

import java.util.ArrayList;
import java.util.List;

public class Account {

    private int balance;
    private int accountNumber;
    private AccountType accountType;

    public Account(int accountNumber, AccountType accountType) {

        this.balance = 0;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
    }

    public Account() {

        this.balance = 0;
        this.accountNumber = 12345;
        this.accountType = AccountType.CHECKING;
    }

    public void deposit(int amountToDeposit) {

        this.balance += amountToDeposit;
    }

    public void withdraw(int amountToWithdraw) {

        if (this.accountType.equals(AccountType.SAVINGS) && amountToWithdraw > this.balance) {
            throw new ArithmeticException("You cannot overdraw on a savings account");
        }

        this.balance -= amountToWithdraw;
    }

    public int getBalance() {

        return this.balance;
    }

    public String toString() {

        return String.format("The account with number %d is of type '%s' and has a balance of %d",
                this.accountNumber, this.accountType, this.balance);
    }

    public void anArrayOfAccounts() {

        Account[] accountArray = new Account[3];

        accountArray[0] = new Account(12345, AccountType.CHECKING);
        accountArray[1] = new Account(54321, AccountType.CHECKING);
        accountArray[2] = new Account(78789, AccountType.SAVINGS);

        for (Account account : accountArray ) {
            System.out.println(account.toString());
        }
    }

    public void aListOfAccounts() {

        List<Account> accountList = new ArrayList<Account>();

        accountList.add(new Account(12345, AccountType.CHECKING));
        accountList.add(new Account(54321, AccountType.CHECKING));
        accountList.add(new Account(78789, AccountType.SAVINGS));

        for(Account account: accountList) {
            System.out.println(account.toString());
        }
    }
}
