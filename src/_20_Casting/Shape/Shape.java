package _20_Casting.Shape;

/*
* render() => preDraw(), drawInternal(), postDraw(); 호출
* protected
* preDraw => 출력(그리기 준비)
* postDraw => 출력(그리기 마무리)
*
* 추상메소드
* area() => double, drawInternal()  protected => void
* */
public abstract class Shape {
    protected void preDraw() {
        System.out.println("그리기 준비");
    }
    protected void postDraw() {
        System.out.println("그리기 마무리");
    }
    public abstract double area();
    protected abstract void drawInternal();
    public void render() {
        preDraw();
        drawInternal();
        postDraw();
    }
}
