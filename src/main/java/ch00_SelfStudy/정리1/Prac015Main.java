package ch00_SelfStudy.정리1;

public class Prac015Main {
    public static void main(String[] args) {

        Prac015 prac015 = new Prac015() {
            @Override
            public void onClick() {
                System.out.println("버튼 클릭");
            }
        };

        prac015.onClick();
    }
}
