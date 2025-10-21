package _15_Overloading;

public class Overloading {
    public static int getPower(int number) {
        return number * number;
    }
    public static int getPower(double doubleNUm) {
        return (int) (doubleNUm * doubleNUm);
    }
    public static String printInfo(String name) {
        return name;
    }
    public static void printInfo(String name, int age) {
        System.out.println(name + " " + age);
    }
    public static void printInfo(String name, int age, String eMail) {
        System.out.println(name + " " + age + " " + eMail);
    }
    public static void main(String[] args) {
        // 메소드 오버로딩
        // 같은 이름의 메소드를 여러개 선언
        // 전달값(파라미터)의 타입이 달라야한다.
        // 또는 갯수가 달라야한다.
        // 대신에 반환형은 같아도 된다.
        System.out.println(getPower(3.15));

        // printInfo()
        // 문자열 이름만 전달해서 => 이름 출력
        // 문자렬 이름과 정수 나이 전달 => 이름, 나이 출력
        // 문자열 이름과 정수 나이, 문자열 이메일 전달 => 이름, 나이, 이메일 출력
        System.out.println(printInfo("박윤호"));
        printInfo("박윤호", 25);
        printInfo("박윤호", 25, "dbdgh0624@naver.com");
    }
}
