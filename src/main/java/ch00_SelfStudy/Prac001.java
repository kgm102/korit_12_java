package ch00_SelfStudy;

import java.util.Scanner;
// 메서드와 입력받은 값을 계산
public class Prac001 {
    public  static  void Cal(int a , int b){
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 2개를 입력하세요 : ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        Cal(x,y);
    }
}
