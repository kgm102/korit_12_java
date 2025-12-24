package ch07_mehods;

import java.util.Scanner;

/*
    지시 사항
    3개 과목의 점수를 입력 받아서, 총합과 평균 점수를 콘솔창에 표시하시오.

    실행 예
    몇 과목의 점수를 입력하시겠습니까? >>> 3
    1과목의 점수를 입력하세요 >>> 100
    2과목의 점수를 입력하세요 >>> 90
    3 과목의 점수를 입력하세요 >>> 95
    총합은 285.0, 평균은 95.0입니다.
 */
public class Method02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 과목의 점수를 입력하시겠습니까? >>>");
        int a = sc.nextInt();
        double sum = 0;
        double averge = 0;
        for(int i = 0; i < a; i++){
            System.out.println((i+1) + "과목의 점수를 입력하세요 >>> ");
            sum += sc.nextDouble();

        }
        System.out.println("총합은 " + sum + "평균은" + sum / a + "입니다.");
    }
}
