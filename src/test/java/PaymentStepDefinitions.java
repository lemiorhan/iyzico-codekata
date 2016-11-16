import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.joda.time.DateTime;

import static org.junit.Assert.assertEquals;


public class PaymentStepDefinitions {

    private SocratesPaymentService socratesPaymentService;

    @When("^credit card number (\\s) asks for payment on date (\\d+)-(\\d+)-(\\d+) as transaction code (\\s)$")
    public void creditCardNumberAsksForPaymentOnDateAsTransactionCode(String creditCardNumber, int year, int month, int day, String transactionCode) throws Throwable {
        PaymentResult paymentResult = socratesPaymentService.makePayment(transactionCode, creditCardNumber, new DateTime(year, month, day, 0, 0));
        assertEquals(new PaymentResult(transactionCode, "FAIL"), paymentResult);
    }


    @Then("^payment should be rejected$")
    public void paymentShouldBeRejected() throws Throwable {
        throw new cucumber.api.PendingException();
    }
}
