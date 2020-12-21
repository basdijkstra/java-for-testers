package exercises;

import org.junit.Test;

import static org.mockito.Mockito.mock;

public class WebShopTest {

    @Test
    public void webShopOrderFailTest() {

        // Create a new instance of the WebShop class

        // Create mocks for the Order class and the PaymentProvider class

        // Configure the Order mock so that getOrderNumber() returns 5678
        // and getOrderTotal() returns 5

        // Configure the PaymentProvider mock so that getResult("Paypal") returns "FAIL"
        // and getResult("iDeal") returns "SUCCESS"

        // Call the checkoutOrder method on the WebShop object using the Order mock,
        // the PaymentProvider mock and "iDeal" as the payment provider
        // Store the return value in a String variable

        // Check that the result equals "Placed order 5678 with 5 articles, payment provider responded with 'SUCCESS'"

    }
}
