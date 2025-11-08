package com.payment.gateway;
//consist all payment details in payment process for a single payment

public class Payment {
    //user who use a payment
   private String Userid;
   //amount for user
   private  double Amount;
   //its about paymentmethod:card or upi
   private String Paymentmethod;
   //current status that tell payment are success, failure or pending
   private PaymentStatus Status;
    // Constructor used to create a new payment request
   public Payment(String Userid,double Amount,String Paymentmethod){
       this.Userid = Userid;
       this.Amount = Amount;
       this.Paymentmethod =Paymentmethod;
       this.Status=PaymentStatus.PENDING;
   }
   //get and set for access a private fields
  public String getUserid(){
       return Userid;
  }
  public double getAmount(){
       return Amount;
    }
    public String getPaymentmethod(){
       return Paymentmethod;
    }
    public PaymentStatus getStatus()
    {
        return Status;
    }

    public void setStatus(PaymentStatus status) {
        this.Status = status;
    }
}
