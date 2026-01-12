package ch14_casting.game.items;

public class Axe implements Weapon{
    @Override
    public void attack() {
        System.out.println("도끼를 강하게 휘두릅니다.");

    }

    public void smash(){
        System.out.println("강력한 세로찍기를 합니다.");
    }
}
