package _12_Array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Array03 {
    public static void main(String[] args) {
        // 정렬
        //int[] nums = {8, 4, 5, 1, 7, 10, 6, 2, 9, 3};
        /*Integer[] nums = {8, 4, 5, 1, 7, 10, 6, 2, 9, 3};
        System.out.println(Arrays.toString(nums));
        // sort()
        Arrays.sort(nums); // 오름차순
        System.out.println(Arrays.toString(nums));
        int max = 0;
        for (int i = 0; i < 10; i++) {
            for (int k = i; k < 10; k++) {
                if (max < nums[k]) {
                    max = nums[k];
                    nums[k] = nums[i];
                    nums[i] = max;
                }
            }
            max = 0;
        }
        System.out.println(Arrays.toString(nums));*/

        /*// 내림차순
        Arrays.sort(nums, Comparator.reverseOrder());
        // Comparator.reverseOrder()는 Integer여야 한다.
        System.out.println(Arrays.toString(nums));*/

        /*
        * int와 Integer는 같지 않다.
        * 같은 정수 타입을 사용하긴 하나 int는 primitive type 즉 원시적인 자료형
        * Integer는 클래스로 이루어져있으며 Wrapper Class
        * 같은 정수지만 int는 연산만 가능한 반면 Integer는 다양한 기능을 사용할 수 있다
        * double - Double
        * float - Float
        * long - Long 등등
        * */

        // 평균 구하기
        int sum = 0; // 총합을 저장하기 위한 변수
        float average = 0F; // 평균을 저장하기 위한 변수
        int[] score = {100, 88, 100, 100, 90};
        // 총합 : **
        // 평균 : **
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        average = sum / (float) score.length;
        System.out.println("총합 : " + sum);
        System.out.println("평균 : " + average);

        // 최대 최솟값 구하기
        int[] score2 = {79, 88, 91, 33, 100, 55, 93};
        int max = 0;
        int min = score2[0];
        for (int i = 0; i < score2.length; i++) {
            if (max < score2[i]) {
                max = score2[i];
            }
            else if (min > score2[i]) {
                min = score2[i];
            }
        }
        System.out.println("max : " + max + " min : " + min);

        // 요일 출력
        char[] week = {'월', '화', '수', '목', '금', '토', '일'};
        // 1에서 7까지 숫자를 입력 받아서 요일을 출력하도록
        // 범위를 벗어나면 잘못 입력하셨습니다. 출력
        Scanner scanner = new Scanner(System.in);
        /*int w = scanner.nextInt();
        switch (w) {
            case 1:
                System.out.println(week[0]);
                break;
            case 2:
                System.out.println(week[1]);
                break;
            case 3:
                System.out.println(week[2]);
                break;
            case 4:
                System.out.println(week[3]);
                break;
            case 5:
                System.out.println(week[4]);
                break;
            case 6:
                System.out.println(week[5]);
                break;
            case 7:
                System.out.println(week[6]);
                break;
            default:
                System.out.println("잘못 입력하셨습니다.");
        }*/

        // 값 target이 처음 나타나는 인덱스를 찾고, 없으면 -1을 출력하기
        // 찾을 target은 1에서 10까지 입력받기
        int[] a = {4, 2, 7, 2, 3, 7, 4};
        int b = 0;
        int t = scanner.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (t == a[i]) {
                System.out.println(i);
                b++;
                break;
            }
        }
        if (b == 0) System.out.println("-1");
    }
}
