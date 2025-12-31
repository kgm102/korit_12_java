package ch11_arrays;

import java.util.Scanner;

public class Array02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("몇 명의 학생을 등록하시겠습니까? >>> ");
        int a = sc.nextInt();
        double sum = 0;
        String[] arr01 = new String[a];
        double[] arr02 = new double[a];

        for (int i = 0; i < a; i++){
            System.out.println((i+1) + " 번 학생의 이름을 등록하세요 >>> ");
            arr01[i] = sc.next();
        }

        for(int i = 0; i < a; i++){
            System.out.println(arr01[i] + " ");
        }

        for(int i = 0; i < a; i++){
            System.out.println((i+1) + " 번 학생의 점수를 입력하세요 >>> ");
            arr02[i] = sc.nextDouble();
            sum += arr02[i];
        }
        for(int i = 0; i < a; i++){
            System.out.println(arr02[i] + " ");
        }

        System.out.println("학생들의 점수 총합은 " + sum + "점입니다.");
    }
}
