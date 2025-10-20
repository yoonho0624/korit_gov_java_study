package _11_While;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 반복문 - DoWhile
        // 일단 한 번 실행 후에 조건 검사
        // => 조건에 상관없이 무조건 최초 1회는 실행
        // while은 조건 검사 후 실행

        /*
        * do {
        *   반복할 코드 -- 최초 한번은 실행
        * } while(조건);
        * */

        /*int i = 1;
        do {
            System.out.println(i++);
        } while (i <= 5);

        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("===메뉴===");
            System.out.println("1. 주문하기");
            System.out.println("2. 취소하기");
            System.out.println("0. 종료");
            System.out.print("선택 : ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("주문을 합니다.");
                    break;
                case 2:
                    System.out.println("취소를 합니다.");
                    break;
                case 3:
                    System.out.println("종료합니다.");
                    break;
                default:
                    System.out.println("올바른 번호를 입력하세요.");
            }
        } while (choice != 0);*/

        // 1부터 n까지 합 (do-while)
        /*int n;
        int k = 0;
        int j = 1;
        n = scanner.nextInt();
        do {
            k = k + j;
            j++;
        } while (n > j - 1);
        System.out.println(k);*/

        // 숫자 맞추기 게임
        int answer = (int) (Math.random() * 100) + 1;
        // 숫자를 입력 받아서 정답을 맞추기
        // 업 다운
        // 시도한 횟수를 나중에 정답 맞췄을 때 같이 출력
        int k = 0;
        int m;
        do {
            m = scanner.nextInt();
            if (m < answer) {
                System.out.println("업");
            }
            else if (m > answer) {
                System.out.println("다운");
            }
            else System.out.println("정답");
            k++;
        } while (m != answer);
        System.out.println("시도한 횟수 : " + k);
    }
}
