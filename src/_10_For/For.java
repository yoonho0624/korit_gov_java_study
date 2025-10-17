package _10_For;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        // 반복문 - for
        /*// for(선언; 조건; 증감) {
                반복할 코드
        }*/
        /*for (int i = 0; i < 10; i++) {
            System.out.println("Hello" + i);
        }

        for (int i = 1;i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }*/

        /*for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }*/

        // 문제
        // 1부터 100까지 다 더한 총합을 구하시오
        /*int total=0;
        for (int i = 1; i <= 100; i++) {
            total = total + i;
        }
        System.out.println(total);*/

        // 문제
        // 1부터 100까지 중에 짝수만 더한 총합
        /*int total=0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                total = total + i;
            }
        }
        System.out.println(total);*/

        // 구구단 출력하기(한 단만)
        // 특정 단을 입력받아서 1부터 9까지 구구단 출력하기

        Scanner scanner = new Scanner(System.in);
        /*int a = scanner.nextInt();
        int total;
        for (int i = 1; i <= 9; i++) {
            total = a * i;
            System.out.println(a + " 곱하기 " + i + " 는 " + total);
        }*/

        // 구구단 전체 출력하기
        /*int total;
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                total = i * j;
                System.out.println(i + " 곱하기 " + j + " 는 " + total);
            }
        }*/

        /*
        * *
        * **
        * ***
        * ****
        * *****
        * */
        /*for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/

        /*
        * *****
        * ****
        * ***
        * **
        * *
        * */
        /*for (int i = 1; i < 6; i++) {
            for (int j = 0; j < 6 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //break, continue
        for (int i = 1; i <= 10 ; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }

        // 1에서 50까지 수 중에서 3의 배수 빼고 출력하기
        // 단 3의 배수는 " " 띄어쓰기 한 칸 출력으로 대체
        for (int i = 1; i <= 50 ; i++) {
            if (i % 3 == 0) {
                System.out.print(" ");
                continue;
            }
            System.out.print(i);
        }*/

        // 1부터 계속 합계를 구하되 합계가 200이 넘어가면 스탑
        // 마지막은 최종 합과 마지막으로 더한 수를 출력
        /*int sum = 0;
        for (int i = 1; ; i++) {
            sum = sum + i;
            if (sum > 200) {
                System.out.println(sum + i);
                break;
            }
        }*/

        // 1부터 100까지의 수 중에서 3의 배수와 5의 배수의 갯수를
        // 각각 출력하시오.
        /*int t = 0;
        int f = 0;
        for (int i = 0; i < 101; i++) {
            if (i % 3 == 0) {
                t++;
            }
            if (i % 5 == 0) {
                f++;
            }
        }
        System.out.println(t + " " + f);
        */
        // 정수 5개를 입력 받고 입력 받은 수 중 가장 큰 값 출력
        // 범위는 1에서 100사이. 만약 1에서 100사이가 아니라면
        // 범위를 벗어났습니다. 출력 후 스탑
        /*int total = 0;
        for (int i = 0; i < 5; i++) {
            int a = scanner.nextInt();
            if (a >= 100 || a < 1) {
                System.out.println("범위를 벗어났습니다.");
                break;
            }
            if (total < a) {
                total = a;
            }
        }
        System.out.println(total);*/

        // 팩토리얼 구하기
        // 숫자를 입력 받아 팩토리얼 구하기
        // 단 1에서 10까지만 입력 받기
        /*int fac = scanner.nextInt();
        int total = 1;
        for (int i = 0; i < fac; i++) {
            total = total * (fac - i);
        }
        System.out.println(total);*/

        // 1부터 50까지 반복하는데
        // 3 6 9일 때는 박수 출력
        // 5일 때는 으악 출력
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == 3) {
                    System.out.println("짝");
                } else if (i * 10 + j + 1 == 50) {
                    System.out.println("으악");
                } else if ((10 * i + j + 1) % 10 == 3 || (10 * i + j + 1) % 10 == 6 || (10 * i + j + 1) % 10 == 9) {
                    System.out.println("짝");
                } else if ((i * 10 + j + 1) % 10 == 5) {
                    System.out.println("으악");
                }
                else System.out.println(i * 10 + j + 1);
            }
        }
    }
}
