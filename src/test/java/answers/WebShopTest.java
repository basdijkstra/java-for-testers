package answers;

import org.junit.*;

import static org.mockito.Mockito.*;

public class WebShopTest {

    @Test
    public void webShopOrderFailTest() {

        // Create a new instance of the WebShop class
        WebShop webShop = new WebShop();

        // Create mocks for the Order class and the PaymentProvider class
        Order orderMock = mock(Order.class);
        PaymentProvider paymentProviderMock = mock(PaymentProvider.class);

        // Configure the Order mock so that getOrderNumber() returns 5678
        // and getOrderTotal() returns 5
        when(orderMock.getOrderNumber()).thenReturn(5678);
        when(orderMock.getOrderTotal()).thenReturn(5);

        // Configure the PaymentProvider mock so that getResult("Paypal") returns "FAIL"
        // and getResult("iDeal") returns "SUCCESS"
        when(paymentProviderMock.getResult("Paypal")).thenReturn("FAIL");
        when(paymentProviderMock.getResult("iDeal")).thenReturn("SUCCESS");

        // Call the checkoutOrder method on the WebShop object using the Order mock,
        // the PaymentProvider mock and "iDeal" as the payment provider
        // Store the return value in a String variable
        String orderResult = webShop.checkoutOrder(orderMock, paymentProviderMock, "iDeal");

        // Check that the result equals "Placed order 5678 with 5 articles, payment provider responded with 'SUCCESS'"
        Assert.assertEquals(
            "Placed order 5678 with 5 articles, payment provider responded with 'SUCCESS'",
            orderResult
        );
    }
}
