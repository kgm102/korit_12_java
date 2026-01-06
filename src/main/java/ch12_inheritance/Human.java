package ch12_inheritance;

public class Human extends Animal{
    private String name;
    private int age;

    public void move(){
        System.out.println("사람이 두 발로 걷습니다.");
    }

    public void read(String book){
        System.out.println(getAnimalName() + "이" + book + "을 읽는 중입니다.");
    }

    public Human() {
        System.out.println("사람 객체가 생성되었습니다.");
    }

}
