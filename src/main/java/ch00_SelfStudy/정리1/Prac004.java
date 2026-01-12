package ch00_SelfStudy.정리1;
// 입력받은 값 판단
import java.util.Scanner;

public class Prac004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 입력해주세요 : ");
        int num = sc.nextInt();

        if(num > 0){
            System.out.println("입력받은 값이 양수입니다.");
        } else if (num < 0) {
            System.out.println("입력받은 값이 음수입니다.");
        }else {
            System.out.println("입력받은 값이 0입니다.");
        }
    }
}
