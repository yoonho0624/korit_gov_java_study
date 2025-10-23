package _16_Class.WaterBottle;

// 문제
// WaterBottle클래스
// currentWater 물의 양 => 속성
// 메소드 물 채우기 fill => 최대용량 1000이상으로 채울 수 없음
// 메소드 물 마시기 drink => 현재 용량보다 초과해서 마실 수 없음
// getter로 현재 물의 양 출력하기
// 객체 생성시 빈병
public class WaterBottle {
    private int currentWater;

    public int getCurrentWater() {
        return currentWater;
    }

    public void fill(int f) {
        if (f + currentWater> 1000) System.out.println("최대용량 1000이상으로 채울 수 없음");
        else if (f > 0) {
            currentWater = currentWater + f;
        }
    }
    public void drink(int d) {
        if (d > currentWater) System.out.println("현재 용량보다 초과해서 마실 수 없음");
        else if (d > 0) {
            currentWater = currentWater - d;
        }
    }
}
