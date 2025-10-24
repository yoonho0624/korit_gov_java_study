package _17_Inheritance;

/*
* Animal 클래스를 상속 받으세요
* 고유 필드 속성으로 language 라는 속성 추가
* setter들을 이용해서 각 속성의 값을 주입
* getAnimalName을 재정의 하여 호출했을때
* "안녕하세요. 제 이름은 ___입니다."라고 출력
* getAnimalAge를 재정의 하여 호출했을때
* "올해 제 나이는 **살 입니다. 내년에는 ** + 1살이 됩니다."라고 출력
* move를 재정의 하여 사람이 두 발로 걷습니다. 라고 재정의
* 고유메소드로 read() 선언하는데 파라미터로 bookName을 받음
* 호출시 파라미터로 받은 bookName을 이용하여 "bookName을 읽는중입니다." 출력
* */
public class Human extends Animal {
    private String language;
    public Human(String animalName, int animalAge, String language) {
        super(animalName, animalAge);
        this.language = language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }
    @Override
    public String getAnimalName(){
        System.out.println("안녕하세요. 제 이름은 " + super.getAnimalName() + "입니다.");
        return super.getAnimalName();
    }
    @Override
    public int getAnimalAge(){
        System.out.println("안녕하세요. 제 나이는 " + super.getAnimalAge() + "입니다." + " 내년에는 " + (super.getAnimalAge() + 1) + "살이 됩니다.");
        return super.getAnimalAge();
    }
    @Override
    public void move() {
        System.out.println("사람이 두 발로 걷습니다.");
    }
    public void read(String bookName) {
        System.out.println(bookName + "을 읽는중입니다.");
    }
}
