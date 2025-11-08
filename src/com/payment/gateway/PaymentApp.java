package com.payment.gateway;

public class PaymentApp {
//    PaymentApp is the entry point of the project.
    public static void main(String[] args) {
        // Create sample payment requests
        Payment payment1 = new Payment("hasan",1500,"CARD");
        Payment payment2 = new Payment("hajmed",360,"upi");
        Payment payment3 = new Payment("aravin",0,"CARD");
        // Create the gateway object to process payments
        PaymentGateway gate = new PaymentGateway();

        // Process each payment one by one
        gate.makepayment(payment1);
        System.out.println("----------------------");
        gate.makepayment(payment2);
        System.out.println("----------------------");
        gate.makepayment(payment3);
        System.out.println("----------------------");

    }
}

