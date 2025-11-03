package _29_Collections.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * 문제 TodoList
 * 1. todoList를 담을 리스트 생성
 * 2. 사용자한테 투두를 입력받을건데 몇개 입력할건지 count변수에 입력받기
 * 3. count만큼 반복해서 사용자에게 투두입력받아 리스트에 추가
 * 4. 그 다음 향상된 for문 사용해서 할 일 목록 출력
 * 5. 목록 출력 뒤 특정 투두를 포함여부를 확인하기 위해서 searchTodo라는 변수에
 *    찾을 투두 입력받기 그러고 포함여부 확인후 여부 출력
 * 6. 포함여부 확인 후 삭제할 투두를 입력받아 삭제하기
 * 7. 투두들을 오름차순 정렬 후 전체 출력
 * 8. 이번엔 투두들을 내림차순 정렬 후 전체 출력
 * 9. 전체 투두들의 갯수 출력하기
 * */
public class todoList {
    public static void main(String[] args) {
        List<String> stringList1 = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("투두 개수 : ");
        int count = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < count; i++) {
            System.out.print("투두 입력 : ");
            String s = scanner.nextLine();
            stringList1.add(s);
        }
        for (String s : stringList1) System.out.println("할 일 목록" + s);
        System.out.print("찾을 투두 : ");
        String searchTodo = scanner.nextLine();
        boolean searchTodoResult1 = stringList1.contains(searchTodo);
        System.out.println("포함여부 : " + searchTodoResult1);
        System.out.print("삭제할 투두 : ");
        String todoRemove = scanner.nextLine();
        stringList1.remove(todoRemove);
        Collections.sort(stringList1);
        System.out.println(stringList1);
        Collections.sort(stringList1, Collections.reverseOrder());
        System.out.println(stringList1);
    }
}
