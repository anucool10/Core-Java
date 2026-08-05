package inheritance;

public class Main {
    public static void main(String[] args) {
        // Testing SmartLight
        SmartLight livingRoomLight = new SmartLight();
        livingRoomLight.deviceName = "Living Room Light"; 
        livingRoomLight.turnOn();                       
        livingRoomLight.changeBrightness(80);           
        
        System.out.println(); 
        
        // Testing SmartThermostat
        SmartThermoStat hallwayThermostat = new SmartThermoStat();
        hallwayThermostat.deviceName = "Hallway Thermostat"; 
        hallwayThermostat.turnOff();                         
        hallwayThermostat.setTemperature(22.5);              
    }
}