package _19_Interface.SmartDevice;

/*
* SmartAirConditioner클래스를 만들고 SmartDevice를 상속
 * 고유 속성
 * boolean turnedOn
 * int temperature = 24
 * getName => "스마트 에어컨" 리턴
 * turnOn => turnedOn = true;
 * "해당 가전 이름"의 전원을 켭니다. 설정 온도 : **도 출력
 * turnOff => 반대로
 * isTurnedOn => 현재 전원 상태 리턴
 * 고유 메소드로 온도 올리는거 하나 내리는거 하나
 * 근데 전원이 꺼져있으면 현재 전원이 꺼져있습니다 출력*/
public class SmartAirConditioner implements SmartDevice {
    private boolean turnedOn;
    private int temperature = 24;
    public void setTurnedOn(boolean turnedOn) {
        this.turnedOn = turnedOn;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String getName() {
        return "스마트 에어컨";
    }

    @Override
    public void turnOn() {
        setTurnedOn(true);
        System.out.println(getName() + "의 전원을 켭니다. 설정 온도 : " + getTemperature() + "도");
    }

    @Override
    public void turnOff() {
        setTurnedOn(false);
        System.out.println(getName() + "의 전원을 끕니다.");
    }

    @Override
    public boolean isTurnedOn() {
        return turnedOn;
    }

    public void onUp() {
        if (!this.turnedOn) System.out.println("현재 전원이 꺼져있습니다.");
        this.temperature += 1;
    }

    public void onDown() {
        if (!this.turnedOn) System.out.println("현재 전원이 꺼져있습니다.");
        this.temperature -= 1;
    }
}
