package ch00_SelfStudy.상속;

public class Cat extends Animal{

    @Override
    public void speak() {
        System.out.println("고양이가 울어요.");
    }

    public Cat(String name) {
        super(name);
    }
}
