package com.payment.gateway;

public class PaymentGateway {
    //PaymentGateway is the main controller of the whole flow.
    public PaymentStatus makepayment(Payment payment) {
        // Handles the full payment process
        // Pick the correct processor based on method (CARD / UPI)
       PaymentProcessor process = getProcessor(payment.getPaymentmethod());
        // If user selected a method that doesn't exist
        if (process == null) {
            System.out.println("Unsupported payment method!");
            payment.setStatus(PaymentStatus.FAILURE);
            return payment.getStatus();
        }
        // Try to process the payment using the selected processo
        boolean success = process.processpayment(payment);
        // Update final status based on success or failure
        payment.setStatus(success ? PaymentStatus.SUCCESS : PaymentStatus.FAILURE);
       // This method chooses which payment processor to use.
        System.out.println("Final Payment Status: " + payment.getStatus());
        return payment.getStatus(); // Unknown payment type
    }



    private PaymentProcessor getProcessor(String method) {
        switch (method.toUpperCase()) {
            case "CARD":
                return new CardPaymentProcessor();
            case "UPI":
                return new UpiPaymentProcessor();
            default:
                return null;
        }
    }
}
