package ch00_SelfStudy.추상2;

public class Mouse extends Device{
    public Mouse(String name) {
        super(name);
    }

    @Override
    public void operate() {
        System.out.println("마우스 클릭");
    }
}
