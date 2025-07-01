package Polymorphism_5;

public class PaymentProcessor {

    // Overloaded method 1: Pay by cash
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " in cash.");
    }

    // Overloaded method 2: Pay by card
    void pay(double amount, String cardNumber) {
        System.out.println("Paid ₹" + amount + " using card: " + cardNumber);
    }

    // Overloaded method 3: Pay using digital wallet
    void pay(double amount, String walletName, String phoneNumber) {
        System.out.println("Paid ₹" + amount + " using " + walletName + " wallet linked to " + phoneNumber);
    }

    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        processor.pay(500);                                 // cash
        processor.pay(1000, "1234-5678-9012-3456");          // card
        processor.pay(750, "Paytm", "9876543210");           // wallet
    }
}
