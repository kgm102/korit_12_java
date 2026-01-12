package ch00_SelfStudy.정리1;

public class Prac013 {
    String name;

    Prac013(String name){
        this.name = name;
    }
    static class Validator{
        static  boolean isValid(String name) {
            return name != null && !name.isEmpty();
        }
    }

}
