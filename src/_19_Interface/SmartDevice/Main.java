package _19_Interface.SmartDevice;

public class Main {
    public static void main(String[] args) {
        SmartHomeHub smartHomeHub = new SmartHomeHub(new SmartAirConditioner(), new SmartLight(), new SmartSpeaker());
        smartHomeHub.smartLightGetName();
        smartHomeHub.smartAirConditionerTurnOn();
        smartHomeHub.turnOffAll();
        smartHomeHub.showStatus();
        smartHomeHub.onSmartLightOnUp();
        smartHomeHub.smartSpeakerIsTurnedOn();
        smartHomeHub.showStatus();
        smartHomeHub.smartSpeakerTurnOn();
        smartHomeHub.showStatus();
        smartHomeHub.smartAirConditionerTurnOn();
        smartHomeHub.onSmartConditionerOnUp();
    }

}
