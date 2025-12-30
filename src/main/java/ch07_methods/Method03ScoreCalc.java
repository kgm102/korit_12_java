package ch07_methods;

import java.util.Scanner;

public class Method03ScoreCalc {
    // 메서드 정의 영역 - Method02에 있던 기능을 메서드로 정의할겁니다.
    public static void calcSumAndavg(){
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

    public static void main(String[] args) {
        // 메서드 호출 영역
        calcSumAndavg();
    }
}
