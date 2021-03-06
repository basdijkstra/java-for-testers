package examples;

public class Calculator {

    private int total;

    public Calculator() {

        this.total = 0;
    }

    public int getTotal() {

        return this.total;
    }

    public void add(int valueToAdd) {

        this.total += valueToAdd;
    }

    public void subtract(int valueToSubtract) {

        this.total -= valueToSubtract;
    }

    public void multiplyBy(int valueToMultiplyBy) {

        this.total *= valueToMultiplyBy;
    }

    public void divide(int valueToDivideBy) {

        if (valueToDivideBy == 0) {
            throw new ArithmeticException("You tried to divide by zero!");
        }
        this.total /= valueToDivideBy;
    }
}
