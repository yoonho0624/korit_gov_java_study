package _17_Inheritance.Shipment;
/*
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
public class BikeShipment extends Shipment{
    public BikeShipment(String start, String last) {
        super(start, last);
    }
    @Override
    public int calcFee(int a, int b) {
        if(a < 0 | b < 0) return 0;
        return 20 * a + 50 * b + 2000;
    }
}
