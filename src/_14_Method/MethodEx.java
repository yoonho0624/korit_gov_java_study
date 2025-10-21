package _14_Method;

public class MethodEx {
    public static int max1(int a, int b, int c) {
        int result;
        if (a < b) {
            result = b;
            if (b < c) {
                result = c;
            }
        }
        else if (a > b) {
            result = a;
            if (a < c) {
                result = c;
            }
        }
        else {
            if (a < c) result = c;
            else result = a;
        }
        return result;
    }
    public static boolean isEven1(int num) {
        return num % 2 == 0;
    }
    public static int abs(int num) {
        return num < 0 ? -(num) : num;
    }
    public static boolean b1(int[] num1, int num2) {
        int a = 0;
        for (int i = 0; i < num1.length; i++) {
            if (num1[i] == num2) a++;
        }
        return a != 0;
    }
    public static void main(String[] args) {
        // 최댓값 구하기 (세 수를 전달)
        // max(3, 7, 5) => 7
        int max = max1(3, 5, 7);
        System.out.println(max);

        // 홀짝 판단
        // isEven(8) => true (짝수면 true, 홀수면 false)
        boolean isEven = isEven1(8);
        System.out.println(isEven);

        // 절댓값 구하기
        // 삼항연산자 이용
        int a = abs(-5);
        System.out.println(a);

        // 포함 여부 (선형 탐색)
        // contains([1, 3, 5], 3) => true, 없으면 false
        boolean b = b1(new int[] {1, 3, 5}, 3);
        System.out.println(b);
    }
}