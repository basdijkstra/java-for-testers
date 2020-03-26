package exercises;

public class WebShop {

    public WebShop() {}

    public String checkoutOrder(Order order, PaymentProvider paymentProvider, String name) {

        int orderNumber = order.getOrderNumber();
        int orderTotal = order.getOrderTotal();

        String paymentProviderResult = paymentProvider.getResult(name);

        // do something to send the message
        return String.format("Placed order %d with %d articles, payment provider responded with '%s'", orderNumber, orderTotal, paymentProviderResult);
    }
}
