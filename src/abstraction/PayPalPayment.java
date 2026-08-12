package abstraction;

public class PayPalPayment extends Payment {
    String email;

    public PayPalPayment(double amount, String email) {
        super(amount);
        this.email = email;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing $" + amount + " using PayPal account: " + email);
        System.out.println("Payment Successful");
        // Specific PayPal logic goes here...
        System.out.println("ThANK YOU!");
    }
}