package ch10_acess_modifier;

class Character{
    public String name;
    private int health;
    int power;
    protected String skill;
    private int exp;

    public Character() {
    }

    public Character(String name, int power, String skill) {
        this.name = name;
        this.power = power;
        this.skill = skill;

        this.health = 100;
        this.exp = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public int getExp() {
        return exp;
    }

    private void setExp(int exp) {
        this.exp = exp;
    }

    public void attack(){
        System.out.println(name + " 이(가) " + power + "로 공격 !");
        this.gainExp(10);
    }

    public void heal(){
        health += 10;
        System.out.println(name + "의 체력이 10 회복되었습니다.");
        System.out.println("현재 체력 : " + getHealth());
    }

    private void gainExp(int amout){
        System.out.println(getName() + "(가) 경험치" + amout + "을(를) 얻었습니다.");
        this.exp += amout;
        System.out.println("현재 경험치 : " + getExp());
    }

    public void getExp(int amout){
        System.out.println(getName() + "(가) 경험치" + amout + "을(를) 얻었습니다.");
        this.exp += amout;
        System.out.println("현재 경험치 : " + getExp());
    }
}

public class CharacterMain {
    public static void main(String[] args) {
    Character warrior = new Character();

    warrior.setName("전사");
    warrior.setHealth(100);
    warrior.setPower(200);
    warrior.setSkill("세로 베기");

    System.out.println("현재 체력 : " + warrior.getHealth());
    warrior.attack();
    warrior.heal();
    warrior.getExp(2000);
    Character healer = new Character("힐러", 100, "힐");
        System.out.println(healer.getHealth());
        System.out.println(healer.getExp());

    }


}
