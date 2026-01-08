package ch00_SelfStudy.상속;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Dog("초코");
        animal1.speak();
        Animal[] animals = new Animal[2];
        animals[0] = new Dog("초코");
        animals[1] = new Cat("나비");

        for(Animal a : animals){
            a.speak();
        }

        if (animal1 instanceof Dog) {
            Dog d = (Dog) animal1;
            d.fetch();
        }
    }
}
