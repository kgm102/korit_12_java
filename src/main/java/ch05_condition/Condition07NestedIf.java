package ch05_condition;

import java.util.Scanner;

/*
    중첩  if문(Nested - if sentence) :
        if 문 내에 if 문이 중첩적으로 사용될 수 있습니다.


 */
public class Condition07NestedIf {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int score = 0;
        String grade = null;
        System.out.println("점수를 입력하세요 >>>");
        score = sc.nextInt();

        // 중첩 if문을 활요한 grade 대입
        if (score > 100 || score < 0) {
            System.out.println("불가능한 점수 입력입니다.");
            grade = "X";
        } else {
            if (score >= 90) {
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
            System.out.println(" 학생의 점수는" + score + "점이고 학점은 " + grade + "입니다." );
        }

    }
}
