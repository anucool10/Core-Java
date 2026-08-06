package inheritance;

public class SmartLight extends SmartDevice{

	int brightness;
	
	
	public void changeBrightness(int level) {
		System.out.println("Updating brightness...");
		brightness = level;
		System.out.println(getDeviceName()+" brightness set to: "+ level);
		
	}

	
}
