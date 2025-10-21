package _15_Overloading;

public class OverloadingEx {
    public static int max(int a, int b) {
        return a > b ? a : b;
    }
    public static double max(double a, double b) {
        return Math.max(a, b);
    }
    public static void main(String[] args) {
        // max()
        // int 숫자 두개 중 더 큰 값 리턴
        // double 숫자 두개 중 더 큰 값 리턴
        System.out.println(max(4, 3));
        System.out.println(max(4.0, 3.0));
    }
}
