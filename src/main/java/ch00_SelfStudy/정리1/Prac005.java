package ch00_SelfStudy.정리1;
// 배열에 변수 저장 및 계산
import java.util.Scanner;

public class Prac005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0;
        System.out.print("정수 5개를 입력해주세요 : ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
            if(arr[i] % 2 == 0 ){
                sum += arr[i];
            }
        }

        System.out.println(sum);

    }
}
