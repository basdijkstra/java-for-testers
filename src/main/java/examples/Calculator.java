package examples;

public class Calculator {

    private int total;

    public Calculator() {
        this.total = 0;
    }

    public void divideByZeroThrowsException(int numberToDivideBy) throws ArithmeticException {

        this.total = this.total / numberToDivideBy;
    }

    public void divideByWithExceptionHandling(int numberToDivideBy) {

        try {
            this.total = this.total / numberToDivideBy;
        }
        catch (ArithmeticException ae) {
            System.out.println("Something went wrong, did you try to divide by zero?");
        }
    }

    public void add(int numberToAdd) {
        this.total += numberToAdd;
    }

    public void divideByWithoutExceptionHandling(int numberToDivideBy) {

        this.total = this.total / numberToDivideBy;
    }

    public void withdraw(int numberToWithdraw) {

        if (numberToWithdraw < 0) {
            throw new IllegalArgumentException("Number to withdraw should be a positive integer");
        }
        this.total -= numberToWithdraw;
    }

}
