package inheritance;

public class SmartLight extends SmartDevice{

	int brightness;
	
	
	public void changeBrightness(int level) {
		brightness = level;
		System.out.println(getDeviceName()+" brightness set to: "+ level);
		
	}

	
}
