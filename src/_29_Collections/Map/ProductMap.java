package _29_Collections.Map;

import java.util.*;

/*
* 1. 스캐너 객체 하나 생성하고 변수명이 productMap인 hashMap선언 (키는 String, 값은 Integer)
* 2. 상품 등록하기 라고 출력하고 for문 이용, 5번 반복, 상품명(키) 입력 받고 가격(값) 입력 받고 productMap에 넣기
* 3. 전체 상품 출력하기 => 향상된 for문 순회하면서 - "아이폰17 => 1250000원" 이런식으로 출력
* 4. 상품 가격 수정 => 수정할 상품명 입력 받고 입력한 상품이 productMap에 있으면 수정할 가격 입력 받고
*    없으면 해당 상품이 없습니다 출력 => 만약 수정 성공시 가격이 수정되었습니다. 출력
* 5. 특정 상품 검색 => 검색할 상품명 입력 받고 입력한 상품이 있으면 출력 없으면 해당 상품이 없습니다. 출력
* 6. 정렬하기 => 키 기준 정렬후 출력
* 7. 내림차순 정렬하기 => 키 기준 내림차순 정렬후 출력
* */
public class ProductMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> productMap = new HashMap<>();
        System.out.print("상품 등록하기 : ");
        for (int i = 0; i < 5; i++) {
            System.out.print("상품명 : ");
            String ps = scanner.nextLine();
            System.out.print("가격 : ");
            int pi = scanner.nextInt();
            productMap.put(ps, pi);
            scanner.nextLine();
        }
        for (Map.Entry<String, Integer> entry : productMap.entrySet()) System.out.println(entry.getKey() + " => " + entry.getValue() + "원");
        List<String> keyList = new ArrayList<>(productMap.keySet());
        System.out.print("수정할 상품명 : ");
        String product = scanner.nextLine();
        if (keyList.contains(product)) {
            System.out.print("수정할 가격 : ");
            Integer pc = scanner.nextInt();
            productMap.put(product, pc);
            System.out.println("가격이 수정되었습니다.");
            scanner.nextLine();
        }
        else System.out.println("해당 상품이 없습니다.");
        System.out.print("특정 상품검색 : ");
        String p = scanner.nextLine();
        if (keyList.contains(product)) {
            System.out.println(p);
        }
        else System.out.println("해당 상품이 없습니다.");
        Set<Map.Entry<String, Integer>> set = new HashSet<>(productMap.entrySet());
        List<Map.Entry<String, Integer>> list = new ArrayList<>(set);
        Collections.sort(list, Map.Entry.comparingByKey());
        System.out.println(list);
        Collections.sort(list, Map.Entry.comparingByKey(Comparator.reverseOrder()));
        System.out.println(list);
    }
}
