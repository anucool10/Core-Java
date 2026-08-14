package interfacee;

public class Main {

	public static void main(String[] args) {
        Flyable myBird = new Bird();
        Flyable myDrone = new Drone();

        myBird.fly();
        myDrone.fly();
    }

}
