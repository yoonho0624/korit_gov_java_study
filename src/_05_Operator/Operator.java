package _05_Operator;

public class Operator {
    public static void main(String[] args) {
        //대입 연산자
        int num1 = 10;
        /*
        * 여기서 =은 대입 연산자, 해당 변수에 데이터(값)을 대입한다는 의미
        * 수학적 의미인 같다라는 의미가 X
        * */

        //산술 연산자
        int num2 = 5;
        System.out.println(num1 + num2); //15
        System.out.println(num1 - num2); //5
        System.out.println(num1 * num2); //50
        System.out.println(num1 / num2); //2
        System.out.println(num1 % num2); //나눈 나머지 0

        System.out.println(2 + 3 * 4); //14
        System.out.println((2 + 3) * 4); //20

        //복합 대입 연산자
        num1 += 10;
        //num1 = num1 + 10;
        num1 -= 5;
        //num1 = num1 - 5;
        num1 *= 2;
        //num1 = num1 * 2;
        num1 /= 3;
        //num1 = num1 / 3;
        num1 %= 4;
        //num1 = num1 % 4;

        System.out.println("============================");

        //증감 연산자
        int j = 10;
        System.out.println(j);
        System.out.println(j++);
        System.out.println(j);
        System.out.println(++j);
        System.out.println(j--);
        System.out.println(j);
        System.out.println(--j);

        //비교 연산자 => 결과값이 항상 boolean
        //== 같다
        System.out.println(num1 == num2);
        //!= 같지 않다
        System.out.println(num1 != num2);
        // > 왼쪽이 더 크다
        System.out.println(num1 > num2);
        // >= 왼쪽이 더 크거나 같다
        System.out.println(num1 >= num2);
        // < 왼쪽이 더 작다
        System.out.println(num1 < num2);
        // <= 왼쪽이 더 작거나 같다
        System.out.println(num1 <= num2);

        System.out.println("===============================");

        //논리 연산자 (&, |, !)
        boolean flag1 = true;
        boolean flag2 = false;
        System.out.println(flag1 & flag2); //& and 논리곱 => 하나라도 false가 있으면 false
        System.out.println(flag1 & flag1);
        System.out.println(flag1 | flag2); //| or 논리합 => 하나라도 true가 있으면 true
        System.out.println(flag2 | flag2);
        System.out.println(flag1 | flag1);
        System.out.println(!flag1); //! not 부정 => 해당 조건을 반대로

        System.out.println("===============================");

        //논리 연산자 조합 (&&, ||)
        //&& => 선조건이 true일 때만 후조건을 실행하며 선조건이 false이면
        // 후조건을 실행하지 않는다
        //|| => 선조건이 true이면 후조건을 실행하지 않으며 선조건이 false일 때만
        // 후조건을 실행한다

        int a = 10;
        int b = 20;
        System.out.println(b > a && a > 5);
        System.out.println(b < a || b > 10);

        System.out.println("===============================");

        //삼항 연산자
        int x = 5;
        int y = 3;
        // (조건) ? 참일때 결과값 : 거짓일때 결과값;
        int max = (x > y) ? x : y;
        System.out.println(max);
        int min = (x < y) ? x : y;
        System.out.println(min);

        y = 5;
        boolean isSame = (x == y) ? true : false;
        System.out.println(isSame);

        String same = (x != y) ? "다름" : "같음";
        System.out.println(same);

        /*
        * height라는 int 변수를 선언
        * 키가 120이상인 경우 탑승가능하도록 하는 삼항연산자
        * 가능하면 "탑승 가능"을 출력하고 불가능하면 "탑승 불가능"을 출력
        * */
        int height = 110;
        String result = height >= 120 ? "탑승 가능" : "탑승 불가능";
        System.out.println(result);

        //홀짝
        int num = 2;
        String result2 = num % 2 == 0 ? "짝수" : "홀수";
        System.out.println(result2);

        //점수가 0~100점까지 주어질때
        //90 이상 A
        //80 이상 B
        //70 이상 C
        //나머지 D

        int score = 78;
        String result3 = score >= 90 ? "A" : score >= 80 ? "B" : score >= 70 ? "C" : "D";
        System.out.println(result3);

    }
}
