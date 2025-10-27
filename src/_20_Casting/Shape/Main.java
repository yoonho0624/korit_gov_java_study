package _20_Casting.Shape;

/*
*
* */
public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Circle(5.0);
        Shape shape2 = new Rectangle(5.0, 3.0);
        Shape shape3 = new Triangle(7.0, 4.0);
        shape2.postDraw();
        shape2.preDraw();
        shape2.drawInternal();
        System.out.println(shape2.area());
        shape2.render();
    }
}
