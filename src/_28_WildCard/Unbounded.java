package _28_WildCard;

public class Unbounded {
    // <?>는 타입에 제한이 없다 => 비한정적 와일드카드
    // 읽기(get)만 가능하고, 쓰기(set)는 불가능하다
    // => 타입이 명확하지 않기 때문
    public static void inspect(Box<?> box) {
        System.out.println("Box의 내욜물 : " + box.getValue());
    }
}
