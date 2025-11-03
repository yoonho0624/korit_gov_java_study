package _29_Collections.List;

import java.util.*;

public class StrList {
    // collection
    // 여러 객체를 모아놓는 것

    // List - 순서가 있는 데이터의 집합, 중복된 요소를 허락한다.
    public static void main(String[] args) {
        /*List<String> strList1 = new ArrayList<>();

        // 요소 추가
        strList1.add("A");
        strList1.add("B");
        strList1.add("A"); // 중복 허용*/

        List<String> strList1 = new ArrayList<>(Arrays.asList("A", "B", "A"));
        List<String> strList2 = new ArrayList<>();
        strList2.add("Java");
        strList2.add("Python");
        strList2.add("C#");
        strList2.add("Javascript");
        strList2.add("Kotlin");

        /*String[] strArray = new String[2];
        strArray[0] = "박윤호";
        strArray[1] = "ㅂㅇㅎ";
        System.out.println(strArray[0]);*/
        System.out.println(strList2.get(3));
        System.out.println(strList2);

        // 특정 요소의 포함 여부 -> contains()
        String searchElem1 = "Python";
        boolean containResult1 = strList2.contains(searchElem1);
        System.out.println(searchElem1 + "의 포함 여부 : " + containResult1);

        String searchElem2 = "Py";
        boolean containResult2 = strList2.contains(searchElem2);
        System.out.println(searchElem2 + "의 포함 여부 : " + containResult2);

        String email = "exeample@naver.com";
        boolean containResult3 = email.contains("@");
        System.out.println("@의 포함 여부 : " + containResult3);

        // 요소 삭제
        String removeElem1 = "Kotlin";
        boolean removeResult1 = strList2.remove(removeElem1);
        System.out.println(removeElem1 + "의 삭제 여부 : " + removeResult1);

        // 오름차순 정렬
        Collections.sort(strList2);
        System.out.println(strList2);

        // 내림차순 정렬
        Collections.sort(strList2, Collections.reverseOrder());
        System.out.println(strList2);

        // List의 길이
        System.out.println(strList2.size());

        // python 언어, javascript 언어...
        // 일반 for문을 이용해서 뒤에 다 언어 붙여서 출력
        // foreach
        for (int i = 0; i < strList2.size(); i++) {
            System.out.println(strList2.get(i) + "언어");
        }
        for (String s : strList2) System.out.println(s + "언어");

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
    }
}
