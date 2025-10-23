package _16_Class.WaterBottle;

// 문제
// WaterBottle클래스
// currentWater 물의 양 => 속성
// 메소드 물 채우기 fill => 최대용량 1000이상으로 채울 수 없음
// 메소드 물 마시기 drink => 현재 용량보다 초과해서 마실 수 없음
// getter로 현재 물의 양 출력하기
// 객체 생성시 빈병
public class WaterBottleMain {
    public static void main(String[] args) {
        WaterBottle waterBottle = new WaterBottle();
        waterBottle.fill(1300);
        waterBottle.drink(600);
        waterBottle.fill(200);
        System.out.println(waterBottle.getCurrentWater());
        WaterBottle waterBottle1 = new WaterBottle();
        System.out.println(waterBottle1.getCurrentWater());
    }
}
