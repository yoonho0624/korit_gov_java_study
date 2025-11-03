package _29_Collections.Set;

import java.util.*;

/*
* 1. "Java", "Python", "C", "Python", "Java", "Java", "C++", "C#", "C", "Java"
*    이 요소들을 리스트에 넣기
* 2. 중복 제거 한 후 출력하기
* 3. 오름차순 정렬된 상태 출력하기
* 4. 특정과목 변수에 Java대입하고 맨 처음 만든 리스트에서 몇개 있는지 출력
* 5. 중복 제거 한 뒤에 set를 이용해서 중복제거된 후의 언어 갯수 출력하기
* */
public class LanguageSet {
    public static void main(String[] args) {
        List<String> stringList1 = new ArrayList<>(Arrays.asList("Java", "Python", "C", "Python", "Java", "Java", "C++", "C#", "C", "Java"));
        List<String> stringList2 = new ArrayList<>();
        Set<String> stringSet = new HashSet<>();
        stringSet.addAll(stringList1);
        System.out.println(stringSet);
        stringList2.addAll(stringSet);
        Collections.sort(stringList2);
        String targetSubject = "Java";
        int count = Collections.frequency(stringList1, targetSubject);
        System.out.println(count);
        System.out.println(stringSet.size());
    }
}
