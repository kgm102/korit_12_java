package ch06_loop01;

import java.util.Scanner;

/*
    Scanner를 이용한 별찍기

    실행 예
    몇 줄의 별을 생성하겠습니까? >>> 3
    *
    **
    ***
    로 만들어질 수 있도록 작성하시오.
    다 하신 분들은
 */
public class Loop08Star2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("몇 줄의 별을 생성하겠습니까? >>>");
        int star = sc.nextInt();

        for(int i = 0; i < star; i++){
            for (int j = 0; j < i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for(int i = 0; i < star; i++){
            for(int j = 0; j < star-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
