package abstraction;

public  abstract class Payment {
	double amount;

	public Payment(double amount) {
        this.amount = amount;
    }
	public void printReceipt() {
        System.out.println("Receipt printed for amount: $" + amount);
    }
	public abstract void processPayment();

}
