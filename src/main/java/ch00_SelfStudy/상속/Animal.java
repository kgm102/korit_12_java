package ch00_SelfStudy.상속;

public class Animal {
    String name;


    public Animal(String name) {
        this.name = name;
    }

    public void speak(){
        System.out.println("동물이 소리를 냅니다.");
    }
}
