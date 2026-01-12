package ch00_SelfStudy.정리1;
// 문자 추출
import java.util.Scanner;

public class Prac007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력해주세요 : ");
        String string = sc.next();

        for(int i = 0; i < string.length(); i++){
            System.out.println(string.charAt(i));
        }
    }
}
