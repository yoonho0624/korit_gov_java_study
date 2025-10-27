package _19_Interface.RemoteController;

/*
* extends 단일 상속
* implements 다중 상속
* */
public abstract class Button implements Press, Up, Down {

    @Override
    public void onDown() {}

    @Override
    public abstract void onPressed();

    @Override
    public void onUp() {}
}
