package _11_While;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        // 반복문 - While
        // 조건이 참일 경우 계속 반복
        // for 차이
        // for문 횟수 중심, while 문 조건 중심
        /*
        * While (조건) {
        *   반복할 코드
        * }
        *
        * */

        // 1에서 5까지 출력
        int i = 1;
        while(i <=5) {
            System.out.println(i);
            i++; // 조건을 변경하기 위한 코드 필요
        }

        i = 10;
        while (i >= 1) {
            System.out.println(i);
            i--; // 조건을 변경하기 위한 코드 필요
        }

        // 짝수만 출력하겠다. (1부터 10까지)
        int j = 1;
        while (j <= 10) {
            if (j % 2 ==0) {
                System.out.println(j);
            }
            j++;
        }

        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        // 점수를 입력한다 (0부터 100)
        /*while (flag) {
            *//*int score = scanner.nextInt();*//*
            if (0 <= score && score <= 100) {
                System.out.println("점수는 " + score);
                flag = false; // break;
            } else {
                System.out.println("다시 입력하세요.");
            }
        }*/

        /*int menu;
        while (true) {
            System.out.println("메뉴를 선택하세요.");
            System.out.println("1. 주문하기");
            System.out.println("2. 취소하기");
            System.out.println("3. 재주문하기");
            System.out.print("메뉴를 고르세요>>>");
            menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("주문하기 메뉴");
                    break;
                case 2:
                    System.out.println("취소하기 실행");
                    break;
                case 3:
                    System.out.println("재주문하기 메뉴");
                    break;
                default:
                    System.out.println("다시 입력해주세요.");
                    continue;
            }
            break;
        }*/

        // 문제 => 1부터 100까지 누적합
        /*int sum = 0;
        int k = 1;
        while (k <= 100) {
            sum = sum + k;
            k++;
        }
        System.out.println(sum);*/

        // 문제 => 1번부터 100번까지 식당 웨이팅
        // 이때 1번부터 차례대로 입장 => **번 손님 입장! 출력
        // 10번 손님이 입장할때 한정메뉴가 솔드아웃
        // 솔드아웃 되었기 때문에 가게 문 닫음
        // 마지막엔 영업종료 출력

        /*int k = 0;
        while (k <= 100) {
            System.out.println(++k + "번 손님 입장!");
            if (k == 10) {
                System.out.println("솔드아웃");
                break;
            }
        }
        System.out.println("영업종료");*/

        // 1번부터 50번까지 웨이팅
        // 메뉴가 20개까지만 한정판매 => 솔드아웃 가게 샷다 내림 출력
        // 이 때 14번이 노쇼 => **번 노쇼 발생! 출력
        // 이것을 while문
        int k=1;
        while (k <= 50) {

            if (k == 14) {
                System.out.println("14번 노쇼 발생!");
                k++;
            }
            else {
                System.out.println(k + "번 손님 입장!");
                k++;
            }

            if (k == 20) {
                System.out.println("솔드아웃");
                break;
            }

        }
        System.out.println("영업종료");
    }
}
