package ch05_condition;

import java.util.Scanner;

public class Condition09Task4 {
    public static void main(String[] args) {
        // 논리 연산자를 위한 조건문 압축
        Scanner sc = new Scanner(System.in);
        System.out.println("연도를 입력하세요 >>>");
        int year = sc.nextInt();
        String leapYear = "윤년입니다.";

        if (year < 0) {
            System.out.println("잘못된 년수를 입력하셨습니다.");
        } else {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            }else {
                leapYear = "윤년이아닙니다.";
            }

            System.out.println(leapYear);
        }
    }
}