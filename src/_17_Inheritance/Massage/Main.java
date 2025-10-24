package _17_Inheritance.Massage;

public class Main {
    public static void main(String[] args) {
        Message message = new Message("기본 메세지 입니다.");
        System.out.println(message.format());

        SimpleMessage simpleMessage = new SimpleMessage("심플메시지입니다");
        System.out.println(simpleMessage.format());

        FancyMessage fancyMessage = new FancyMessage("팬시 메시지입니다.");
        System.out.println(fancyMessage.format());
        fancyMessage.print();
    }
}
