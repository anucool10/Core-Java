	package inheritance;

public class SmartDevice {
	String deviceName;
	 boolean isOn;
	


	
	public void turnOn() {
		isOn= true;
		System.out.println(getDeviceName() +" is now ON.");
		
	}
	public void turnOff() {
		isOn = false;
		System.out.println(getDeviceName()+" is now OFF.");
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

}
