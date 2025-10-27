package _19_Interface.SmartDevice;

/*
* 인터페이스 상속받고 에어컨이랑 똑같이
* 속성으로 turnedOn이랑 brightness = 50
* 고유 메소드로 밝기를 올리는거 하나 내리는거 하나
* 올리거나 내릴때 전원이 켜져있어야 하며 10씩 증감
* */
public class SmartLight implements SmartDevice {
    private boolean turnedOn;
    private int brightness = 50;

    public void setTurnedOn(boolean turnedOn) {
        this.turnedOn = turnedOn;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    @Override
    public String getName() {
        return "스마트 라이트";
    }

    @Override
    public void turnOn() {
        this.turnedOn = true;
        System.out.println(getName() + "의 전원을 켭니다. 설정 밝기 : " + this.brightness);
    }

    @Override
    public void turnOff() {
        this.turnedOn = false;
        System.out.println(getName() + "의 전원을 끕니다. 설정 밝기 : " + this.brightness);
    }

    @Override
    public boolean isTurnedOn() {
        return this.turnedOn;
    }
    public void onUp() {
        if (!this.turnedOn) System.out.println("현재 전원이 꺼져있습니다.");
        if (this.turnedOn) this.brightness += 10;
    }

    public void onDown() {
        if (!this.turnedOn) System.out.println("현재 전원이 꺼져있습니다.");
        if (this.turnedOn) this.brightness -= 10;
    }
}
