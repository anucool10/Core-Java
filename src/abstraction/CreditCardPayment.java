package abstraction;

public class CreditCardPayment extends Payment {
	String cardNumber;

    public CreditCardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }
    @Override
    public void processPayment() {
        System.out.println("Processing $" + amount + " using Credit Card: " + cardNumber);
        System.out.println("Payment Successful");
    }

	

}
