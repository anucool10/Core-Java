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
        // Specific PayPal logic goes here...
    }
}