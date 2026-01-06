package ch12_inheritance;

public class Tiger extends Animal{
    // 자식 고유의 field 정의
    private double weight;
    // 자식 클래스의 고유 메서드 정의
    public void hunt(){
        System.out.println(getAnimalName() + "이(가) 사냥을 합니다.");
    }

    //고유 메서드의 overload
    public void hunt(String prey){
        System.out.println(getAnimalName() + "이(가) " + prey + "을(를) 사냥합니다.");
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void move() {
        System.out.println("호랑이가");
        super.move();
    }

    public Tiger(String animalName, double weight) {
        super(animalName);
        this.weight = weight;
    }

    public Tiger(int animalAge, double weight) {
        super(animalAge);
        this.weight = weight;
    }

    public Tiger(double weight) {
        this.weight = weight;
    }

    public Tiger(){

    }
}
