package com.payment.gateway;
//  The main method that handles the payment logic.
//       Each payment type will have its own way of processing,
//       so we keep it abstract here.
public interface PaymentProcessor {
// Returns:
//         true  -> payment approved
//         false -> payment failed

 boolean processpayment(Payment payment);
// The main method that handles the payment logic.
    }



