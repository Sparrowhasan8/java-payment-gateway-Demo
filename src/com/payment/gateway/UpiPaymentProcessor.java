package com.payment.gateway;
//this class that  make a upi payment
public class UpiPaymentProcessor implements PaymentProcessor{
 @Override
 //overide method from the processer
    public boolean processpayment(Payment payment) {
     System.out.println("Processing UPI Payment...");

     //validation about amount same as card payment
     if(payment.getAmount()<1){
         System.out.println("Amount is too low");
         return false;
     }
     //its make upi transaction
     boolean success = Math.random()>0.1;
     if(success){
         System.out.println("UPI transaction successful...");
     }else{
         System.out.println("UPI transaction failed...");
     }

     return success;

 }
}
