package ch00_SelfStudy.추상2;

public class Keyboard extends Device{
    public Keyboard(String name) {
        super(name);
    }

    @Override
    public void operate() {
        System.out.println("키보드 입력");
    }
}
