package ch00_SelfStudy.정리1;
// 조건 메소드
public class Prac008 {

    public static int max(int a, int b){

        return a > b ? a : b;
    }

    public static void main(String[] args) {

        int result = max(3,5);
        System.out.println("큰 수는 " + result + "이다");
    }
}
