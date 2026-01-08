package ch00_SelfStudy.상속;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("멍멍");
    }

    public void fetch(){
        System.out.println("개가 물어뜯습니다.");
    }
}
