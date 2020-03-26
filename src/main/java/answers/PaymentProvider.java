package answers;

public class PaymentProvider {

    String result;

    public PaymentProvider() {

        this.result = "FAIL";
    }

    public String getResult(String providerName) {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
