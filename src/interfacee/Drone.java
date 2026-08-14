package interfacee;

public class Drone implements Flyable {
    @Override
    public void fly() {
        System.out.println("The drone spins its four propellers and takes off! 🚁");
    }
}