package _14_Method;

public class Parameter {
    public static void power(int number) {
        int result = number * number;
        System.out.println(number + "의 2승은 " + result + "입니다.");
    }
    public static void powerByExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        System.out.println(number + "의 " + exponent + "승은 " + result + "입니다.");
    }
    public static void avg(int num1, int num2, int num3) {
        float result = (num1 + num2 + num3) / (float)3;
        System.out.println(result);
    }
    public static void isEven(int num) {
        String result = num % 2 == 0 ? "짝수" : "홀수";
        System.out.println(result);
    }
    public static void main(String[] args) {
        power(2);
        powerByExp(2, 4);

        // 세개의 정수를 전달하여 평균을 출력하는 메소드를 만드시오
        avg(3, 4, 6);

        // 정수를 전달하여 짝수인지 홀수인지 판별 후 출력하는 메소드
        // 단 삼항 연산자를 사용할 것
        isEven(5);
    }
}
