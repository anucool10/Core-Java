package abstraction;

public class Main {
    public static void main(String[] args) {
        
        Payment payment1 = new CreditCardPayment(150.00, "1234-5678-9012");
        Payment payment2 = new PayPalPayment(45.50, "user@gmail.com");
        Payment payment3 = new CreditCardPayment(50,"0000-0000-0000");

        
        payment1.processPayment();
        payment1.printReceipt();

        System.out.println("-------------------");

        payment2.processPayment();
        payment2.printReceipt();
        
        System.out.println("-------------------");

        payment3.processPayment();
        payment3.printReceipt();
    }
    
}