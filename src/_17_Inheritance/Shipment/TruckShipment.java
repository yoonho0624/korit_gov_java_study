package _17_Inheritance.Shipment;

/* 자식클래스 TruckShipment
 * allargs 생성자
 * calcFee(무게, 거리) 오버라이드 =>
        * 기본금액 5000에 무게당 40 + 거리당 30 반환
 * 만약 무게 또는 거리가 0미만이면 무게 또는 거리는 0으로 본다
 * */
public class TruckShipment extends Shipment{
    public TruckShipment(String start, String last) {
        super(start, last);
    }
    @Override
    public int calcFee(int a, int b) {
        if(a < 0 | b < 0) return 0;
        return 40 * a + 30 * b + 5000;
    }
}
