package exercises;

public class Account {

    private int balance;

    public Account(int balance) {

        this.balance = balance;
    }

    public int getBalance() {

        return this.balance;
    }

    public void deposit(int amountToDeposit) {

        this.balance += amountToDeposit;
    }

    public void withdraw(int amountToWithdraw) throws Exception {

        if(checkForSufficientFunds(amountToWithdraw)) {
            this.balance -= amountToWithdraw;
        }
        else {
            throw new Exception(String.format("Insufficient funds: could not withdraw %d from this account", amountToWithdraw));
        }
    }

    private boolean checkForSufficientFunds(int amount) {

        return this.balance >= amount;
    }
}
