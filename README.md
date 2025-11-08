# Java Payment Gateway Demo

This is a simple demo project that simulates how a payment gateway works in Java.  
It uses Object Oriented Programming concepts like interfaces, classes, enums, and polymorphism.

The project supports **multiple payment methods** using:
- `CARD`
- `UPI`

If an unsupported payment method is given, the gateway rejects the request.

---

## ✅ Features
- Clean and simple payment processing flow.
- Uses `PaymentProcessor` interface for loose-coupling.
- Separate classes for **Card** and **UPI** payments.
- Returns final `PaymentStatus` after processing.
- Easy to extend by adding more processors (ex: Wallet, NetBanking).
- Beginner-friendly structure.

---

## ✅ Project Structure
src/
├── Main.java // Simple runner class
└── com/payment/gateway/
├── Payment.java // Payment data model
├── PaymentStatus.java // Enum for SUCCESS / FAILURE
├── PaymentProcessor.java // Interface
├── CardPaymentProcessor.java // Handles CARD payments
├── UpiPaymentProcessor.java // Handles UPI payments
├── PaymentGateway.java // Core gateway logic
└── PaymentApp.java // Demo tester

---

## ✅ How It Works

1. A `Payment` object is created with:
   - userId
   - amount
   - payment method (ex: CARD, UPI)

2. `PaymentGateway` checks which processor to use.

3. Gateway calls:
processor.processPayment(payment)

4. The specific processor validates and returns **true / false**.

5. Final status is updated: `SUCCESS` or `FAILURE`.

---

## ✅ Example Output
----- Payment 1 -----
Processing Card Payment...
Final Payment Status: SUCCESS

----- Payment 2 -----
Processing UPI Payment...
Final Payment Status: SUCCESS

---

## ✅ How to Run

1. Clone the project:
   ```bash
   git clone https://github.com/Sparrowhasan8/java-payment-gateway-Demo.git
   Open in IntelliJ IDEA or VS Code.

Run the file:PaymentApp.java
✅ Extend the Project

You can easily add new payment methods:

WalletPaymentProcessor

NetBankingPaymentProcessor

CryptoPaymentProcessor (just for fun)

QR Code payment

Just:

1.Create a new class

2.Implement PaymentProcessor

3.Add it inside getProcessor() in PaymentGateway
This project is open source and free to use for learning.

---

If you want, I can also:

✅ Add a Class Diagram (UML) inside README  
✅ Add Images / ASCII diagram  
✅ Add JUnit tests  
✅ Improve formatting to look more premium  

Just tell me.



