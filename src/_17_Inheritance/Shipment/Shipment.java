package _17_Inheritance.Shipment;
/*
 * 배송비 계산기
 * 클래스 Shipment
 * 속성은 출발지, 목적지
 * allargs 생성자
 * route() 메소드 리턴 예 => "부산 -> 서울"
 * calcFee() 메소드 파라미터 무게와 거리 리턴은 그냥 0을 리턴
 * calcFee는 자식클래스에서 재정의 할 예정
 *
 * 자식클래스 BikeShipment
 * allargs 생성자
 * calcFee(무게, 거리) 오버라이드 =>
 * 기본금액 2000에 무게당 20 + 거리당 50 반환
 * 만약 무게 또는 거리가 0미만이면 무게 또는 거리는 0으로 본다
 *
 * 자식클래스 TruckShipment
 * allargs 생성자
 * calcFee(무게, 거리) 오버라이드 =>
 * 기본금액 5000에 무게당 40 + 거리당 30 반환
 * 만약 무게 또는 거리가 0미만이면 무게 또는 거리는 0으로 본다
 * */
public class Shipment {
    private String start;
    private String last;

    public Shipment(String start, String last) {
        this.last = last;
        this.start = start;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }
    public String route() {
        return start + " -> " + last;
    }
    public int calcFee(int a, int b) {
        return 0;
    }
}
