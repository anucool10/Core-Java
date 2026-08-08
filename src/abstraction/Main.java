package abstraction;

public class Main {
    public static void main(String[] args) {
        
        Payment payment1 = new CreditCardPayment(150.00, "1234-5678-9012");
        Payment payment2 = new PayPalPayment(45.50, "user@gmail.com");

        
        payment1.processPayment();
        payment1.printReceipt();

        System.out.println("-------------------");

        payment2.processPayment();
        payment2.printReceipt();
    }
}