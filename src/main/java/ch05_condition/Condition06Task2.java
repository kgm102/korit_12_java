package ch05_condition;
/*
    Condition05 에서의 조건은 100 초과 0 미만도 등급이 나온다
    위에 조건시 grade를 X로 하기
 */

import java.util.Scanner;

public class Condition06Task2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력하세요 >>> ");
        int score = sc.nextInt();
        System.out.print("이름을 입력하세요 >>> ");
        String name = sc.next();
        String grade = null;
        if (100 < score || score < 0) {
            grade = "x";
        } else if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println(name +" 학생의 점수는" + score + "점이고 학점은 " + grade + "입니다." );



    }
}
