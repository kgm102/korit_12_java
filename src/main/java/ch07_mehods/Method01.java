package ch07_mehods;

import java.util.Scanner;

public class Method01 {

    // method 정의 영역

    public static void call1(){
        System.out.println("x x");
    }

    public static void call2(String example){
        System.out.println("[o x]");
        System.out.println("오늘 기분은 : " + example);
    }

    public static void main(String[] args) {
    call1();                    // 매개변수 없음
    call2("최악");    // 매개변수 요구



    }
}
