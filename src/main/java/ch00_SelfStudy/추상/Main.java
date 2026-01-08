package ch00_SelfStudy.추상;

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.speak();

        Animal[] animals = {
                new Dog(),
                new Cat(),
        };

        for(Animal animal : animals){
            animal.speak();
        }
    }
}

