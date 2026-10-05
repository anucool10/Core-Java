package inheritance;

public class SmartThermoStat extends SmartDevice{
	double targetTemperature;

	
	public void setTemperature(double temp) {
		targetTemperature = temp;
		System.out.println("Setting up the temperature");
		System.out.println(getDeviceName()+" temperature set to "+ temp + " degrees");
	}

	

}
