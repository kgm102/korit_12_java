package ch18_generic.WildCard;

public class Human extends Animal{
    @Override
    public void move() {
        System.out.println("사람이 두발로 뜁니다.");
    }

    public void read(){
        System.out.println("사람이 책을 읽습니다.");
    }
}
/*
    Tiger 클래스에 가서 Animal 상속 받고,
    호랑이가 네 발로 뜁니다. 라고 구현하시오.
    또한 hunt() 메서드를 저으이하고
    호랑이가 사냥을 합니다. 작성

    Car 클래스는 Animal 상속 안받고
    move() 클래스를 통해 차가 움직인다 정의
    또한 brake()를 통해 차가 멈춘다.
 */
