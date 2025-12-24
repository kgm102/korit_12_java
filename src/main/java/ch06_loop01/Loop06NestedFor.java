package ch06_loop01;

import java.util.Scanner;

/*
        중첩 for문도 가능합니다.
        for(int i = 0; i < 100; i++) {
            반복실행문 1-ㅁ
            for(int j = 0; j < 100; j++ {
            반복실행문2
            }
            반복실행분 1-b
        }
        for 문을 확용하여 1일차 1교시입니다. ~ 5일차 3교시입니다. 까지 출력하시오
        다 하면 구구단 for문으로 출력하시오.
 */
public class Loop06NestedFor {
    public static void main(String[] args) {

//        for(int i = 0; i < 5; i++){
//            for(int j = 0; j < 3; j++){
//                System.out.println((i+1) + "일차 " + (j+1) + "교시입니다.");
//            }
//        }
//
//        for(int i = 2; i < 10; i++){
//            for(int j = 1; j < 10; j++){
//                System.out.println(i + " x " + j + " = " + (i*j));
//            }
//            System.out.println();
//        }
//
//        for (int i = 1; i < 101; i++){
//            System.out.print(i + " ");
//            if(i % 10 == 0){
//                System.out.println();
//            }
//        }
//        System.out.println();
//        for(int i = 1; i < 101; i +=10){
//            System.out.println(i + " " +(i+1)+" "+(i+2)+" "+(i+3)+" "+(i+4)+" "+(i+5)+" "+(i+6)+" "+(i+7)+" "+(i+8)+" "+(i+9));
//
//        }

        /*
            숫자를 입력 받아서 1부터 N까지 홀수만 더하는 for 반복문을 작성하시오.
            다 했으면 짝수만 구하는 for 반복문을 작성하시오.
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("1부터 몇 가지 더하시겠습니까? >>> ");
        int a = sc.nextInt();
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 1; i < a+1; i++){
            if(i % 2 == 0){
                sum1 += i;
            }else {
                sum2 += i;
            }
        }

        System.out.println("1부터 " + a + "까지 중 짝수의 합은 " + sum1 + "입니다.");
        System.out.println("1부터 " + a + "까지 중 홀수의 합은 " + sum2 + "입니다.");

    }
}
