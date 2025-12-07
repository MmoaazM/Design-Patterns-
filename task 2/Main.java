import java.util.Map;

public class Main{
    public static void main(String [] args)
    {
        paymentRequest simpleRequest = new paymentRequest.builder()
                .amount(100)
                .currency("egp")
                .Build();

        paymentRequest customerRequest = new paymentRequest.builder()
                .amount(200)
                .currency("egp")
                .customerId("123")
                .paymentMethodId("1")
                .Build();
        paymentRequest complexRequest = new paymentRequest.builder()
                .amount(300)
                .currency("Euro")
                .metadata(Map.of("urgent","ay haga"))
                .statementDescriptor("anything")
                .captureMethod(captureMethod.manualCharge)
                .Build();

        simpleRequest.show();
        System.out.println();

        customerRequest.show();
        System.out.println();

        complexRequest.show();
        System.out.println();

    }


}


