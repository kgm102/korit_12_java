package ch00_SelfStudy.정리1;

import java.util.Scanner;

public class Prac011 {
    public static void main(String[] args) {
//        1. 점수 입력
//        2. 평균 출력
//        0. 종료
//        선택: 2
//        점수를 먼저 입력하세요
//
//        선택: 1
//        점수 입력: 10
//        점수 입력: 20
//        점수 입력: 30
//        점수 입력: 40
//        점수 입력: 50
//
//        선택: 2
//        평균: 30
//
//        선택: 0
//        프로그램 종료
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        int sum = 0;
        boolean isInput = false;
        while (true) {
            System.out.println("1. 점수입력");
            System.out.println("2. 평균 출력");
            System.out.println("0. 종료");
            System.out.print("선택 : ");

            int choice = sc.nextInt();
            if (choice == 0) {
                System.out.println("프로그램을 종료합니다");
                break;
            }

            switch (choice){
                case 1:
                    sum = 0;
                        for(int i = 0; i < arr.length; i++){
                            System.out.print("점수 입력 : ");
                            arr[i] = sc.nextInt();
                            sum += arr[i];
                        }
                        isInput = true;
                        break;
                case 2:
                        if(isInput == false){
                            System.out.println("점수를 우선 입력해주세요.");
                            break;
                        }else {
                            System.out.println("평균 : " + (sum / arr.length));
                            break;
                        }
                default:
                    System.out.println("잘못된 선택");
            }
        }
    }
}
