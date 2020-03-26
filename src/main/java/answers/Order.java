package answers;

public class Order {

    private int orderNumber;
    private int orderTotal;

    public Order(int orderNumber, int orderTotal) {
        this.orderNumber = orderNumber;
        this.orderTotal = orderTotal;
    }

    public Order() {
        this.orderNumber = 1234;
        this.orderTotal = 10;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public int getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(int orderTotal) {
        this.orderTotal = orderTotal;
    }
}
