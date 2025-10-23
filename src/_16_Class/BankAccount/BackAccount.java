package _16_Class.BankAccount;
/*
 * BankAccount 클래스에서 속성으로 balance 선언
 * balance는 private로 제한
 * 해당 객체를 생성할때 balance에 값 주입
 * 객체가 생성될때 "계좌가 개설되었습니다. 현재 잔액 : ****원" 출력이 되도록
 * balance의 값을 볼 수 있게 get만들기
 * 메소드로 deposit, withdraw 만들기
 * 이때 deposit => 입금 금액이 0원 이상일때 입금이 가능하도록
 * 입금이 되었을 때 "계좌에 ****원이 입금되었습니다. 현재 잔액 : ****원" 출력
 * withdraw => 출금액이 0원 이상이면서 잔액이 출금액보다 이상일 경우 출금 가능하도록
 * 출금액이 0원 이상이 되지 않으면 "출금액은 0원 초과이어야 합니다" 출력
 * 출금액이 잔액보다 많을 경우 "잔액이 부족합니다. 현재 잔액 : ****원" 출력
 * 메인에서 계좌 개설 후 한번씩 다 테스트 해보기
 * */
public class BackAccount {
    private int balance;

    public BackAccount(int balance) {
        System.out.println("계좌가 개설되었습니다. 현재 잔액 : " + balance + "원");
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int in) {
        if (in >= 0) {
            balance = balance + in;
            System.out.println("계좌에 " + in + "원이 입금되었습니다. 현재 잔액 : " + balance + "원");
        }
    }
    public void withdraw(int out) {
        if (out >= 0 && out <= balance) {
            balance = balance - out;
        }
        else if (out < 0) System.out.println("출금액은 0원 초과이어야 합니다");
        else System.out.println("잔액이 부족합니다. 현재 잔액 : " + balance + "원");
    }
}
