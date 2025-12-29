package ch07_mehods;

import java.util.Scanner;

public class Method04ScoreCalc2 {
    // method 정의 영역
    public static double SumCalc(int a){
        Scanner sc = new Scanner(System.in);
        double sum = 0;     // 지역변수 sum 선언 및 초기화
        for(int i = 0; i < a; i++){
            System.out.print((i+1) + "번째 과목의 점수를 입력하세요. >>> ");
            sum += sc.nextDouble();
        }
        sc.close();
        return sum;
    }

    public static void AverageCalc(int a){
        double sum = SumCalc(a);
        System.out.println("과목수: " + a);
        System.out.println("평균 : "+ sum / a);
    }


    public static void main(String[] args) {
        // method 호출 영역
        AverageCalc(5);
    }
}
