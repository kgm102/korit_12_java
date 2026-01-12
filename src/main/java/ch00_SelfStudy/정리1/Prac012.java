package ch00_SelfStudy.정리1;

public class Prac012 {
    private  String mode = "k5";

    class Engine{
        void start(){
            System.out.println(mode + " 엔진 시동");
        }
    }

    void run(){
        Engine engine = new Engine();
        engine.start();
    }
}
