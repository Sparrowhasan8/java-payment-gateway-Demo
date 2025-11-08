package com.payment.gateway;

//import com.sun.net.httpserver.Authenticator;
//this class handles a card based payments

public class CardPaymentProcessor implements PaymentProcessor {
@Override
public boolean processpayment(Payment payment) {
    System.out.println("Processing Card Payment...");

    //validation that makes an amount that makes amount sense...

    if(payment.getAmount()<=0){
        System.out.println("Invalid amount");
        return false;
    }
    //math.random=0.0 - 0.1;
    boolean success = Math.random()>0.2;
    if(success){
        System.out.println("Card Payment Approved!");
    }else{
        System.out.println("Card Payment Declained!");
    }
    return success;
}
}


