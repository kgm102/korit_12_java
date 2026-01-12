package ch00_SelfStudy.정리2now;

public class Weapon implements Attackable{

    protected String weapon;
    protected String damage;

    public Weapon(String weapon, String damage) {
        this.weapon = weapon;
        this.damage = damage;
    }

    public void showInfo(){
        System.out.println("무기 : " + weapon + "공격력 : " + damage);
    }

    @Override
    public void attack() {

    }
}
