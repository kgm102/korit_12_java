package ch00_SelfStudy.정리1;

import java.util.Scanner;
// 간단한 두 수의 계산 프로그램 작성
public class Prac009 {
    public static void main(String[] args) {

//        1. 더하기
//        2. 빼기
//        0. 종료
//        1 선택 → 두 수 입력 후 합 출력
//
//        2 선택 → 두 수 입력 후 차 출력
//
//        0 선택 → 프로그램 종료
//
//✔️ 조건
//
//        while(true) 사용
//
//        switch 또는 if 사용
//
//        Scanner 사용

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. 더하기");
            System.out.println("2. 빼기");
            System.out.println("0. 종료");

            System.out.println("원하시는 메뉴를 골라주세요.");

            int choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.print("첫 번째 수: ");
            int a = sc.nextInt();
            System.out.print("두 번째 수: ");
            int b = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.println("결과: " + (a + b));
                    break;
                case 2:
                    System.out.println("결과: " + (a - b));
                    break;
                default:
                    System.out.println("잘못된 선택");
            }
        }

        }


    }

