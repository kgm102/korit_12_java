package ch00_SelfStudy.정리2now;

public class Sword extends Weapon{

    public Sword() {
        super("검", "15");
    }

    @Override
    public void attack() {
        System.out.println("검으로 베었다.");
        System.out.println("치명타 발생!");
    }
}
