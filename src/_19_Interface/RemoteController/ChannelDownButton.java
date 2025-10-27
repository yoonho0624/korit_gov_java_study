package _19_Interface.RemoteController;

public class ChannelDownButton extends Button {

    // 필수구현
    @Override
    public void onPressed() {
        System.out.println("채널을 한 칸 내립니다.");
    }

    // 필요에 의해서 일반 메소드를 재정의
    @Override
    public void onDown() {
        System.out.println("채널을 계속 내립니다.");
    }
}