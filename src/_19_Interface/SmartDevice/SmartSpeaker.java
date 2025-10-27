package _19_Interface.SmartDevice;

/*
* 똑같이
* 속성으로 turnedON, playListName = "발라드"
* 고유 메소드로 playListName을 파라미터로 받아서 해당 재생 목록을 재생하는 메소드
* */
public class SmartSpeaker implements SmartDevice {
    private boolean turnedOn;
    private String playListName = "발라드";

    public void setTurnedOn(boolean turnedOn) {
        this.turnedOn = turnedOn;
    }

    public String getPlayListName() {
        return playListName;
    }

    public void setPlayListName(String playListName) {
        this.playListName = playListName;
    }

    @Override
    public String getName() {
        return "스마트 스피커";
    }

    @Override
    public void turnOn() {
        this.turnedOn = true;
        System.out.println(getName() + "의 전원을 켭니다. 설정 장르 : " + this.playListName);
    }

    @Override
    public void turnOff() {
        this.turnedOn = false;
        System.out.println(getName() + "의 전원을 켭니다. 설정 장르 : " + this.playListName);
    }

    @Override
    public boolean isTurnedOn() {
        return this.turnedOn;
    }

    public void play(String playListName) {
        this.playListName = playListName;
        System.out.println(playListName);
    }
}
