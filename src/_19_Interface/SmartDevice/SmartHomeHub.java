package _19_Interface.SmartDevice;

/*
* 필드에 각 가전이 들어있음
* 고유 메소드로 turnOnAll() => 모든 가전을 전원 킴
* turnOffAll() => 모든 가전의 전원을 끔
* showStatus() => 모든 가전의 상태 출력
* */
public class SmartHomeHub {
    private SmartAirConditioner smartAirConditioner;
    private SmartLight smartLight;
    private SmartSpeaker smartSpeaker;

    public SmartHomeHub(SmartAirConditioner smartAirConditioner, SmartLight smartLight, SmartSpeaker smartSpeaker) {
        this.smartAirConditioner = smartAirConditioner;
        this.smartLight = smartLight;
        this.smartSpeaker = smartSpeaker;
    }

    public void smartConditionerGetName() {
        System.out.println(smartAirConditioner.getName());
    }
    public void smartAirConditionerTurnOn() {
        smartAirConditioner.turnOn();
    }
    public void smartAirConditionerTurnOff() {
        smartAirConditioner.turnOff();
    }
    public void smartAirConditionerIsTurnedOn() {
        System.out.println(smartAirConditioner.isTurnedOn());
    }
    public void smartLightGetName() {
        System.out.println(smartLight.getName());
    }
    public void smartLightTurnOn() {
        smartSpeaker.turnOn();
    }
    public void smartLightTurnOff() {
        smartLight.turnOff();
    }
    public void smartLightIsTurnedOn() {
        System.out.println(smartLight.isTurnedOn());
    }
    public void smartSpeakerGetName() {
        System.out.println(smartSpeaker.getName());
    }
    public void smartSpeakerTurnOn() {
        smartSpeaker.turnOn();
    }
    public void smartSpeakerTurnOff() {
        smartSpeaker.turnOff();
    }
    public void smartSpeakerIsTurnedOn() {
        System.out.println(smartSpeaker.isTurnedOn());
    }
    public void onSmartConditionerOnUp() {
        smartAirConditioner.onUp();
    }

    public void onSmartConditionerOnDown() {
        smartAirConditioner.onDown();
    }

    public void onSmartLightOnUp() {
        smartLight.onUp();
    }

    public void onSmartLightOnDown() {
        smartLight.onDown();
    }

    public void onSmartSpeakerPlay(String a) {
        smartSpeaker.play(a);
    }

    public void turnOnAll() {
        smartAirConditioner.turnOn();
        smartLight.turnOn();
        smartSpeaker.turnOn();
    }

    public void turnOffAll() {
        smartAirConditioner.turnOff();
        smartLight.turnOff();
        smartSpeaker.turnOff();
    }

    public void showStatus() {
        System.out.println(smartAirConditioner.isTurnedOn());
        System.out.println(smartLight.isTurnedOn());
        System.out.println(smartSpeaker.isTurnedOn());
    }
}
