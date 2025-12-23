package ch03_scanner;

import java.util.Scanner;

/*
    1. 나이를 입력하세요 >>> 19
    저는 올해 19살입니다.
    내년에는 20살이됩니다.
 */
public class Scanner02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("나이를 입력하세요 >>> ");
//        int age = sc.nextInt();
//
//        System.out.println("저는 올해 " + age + "살입니다.");
//        System.out.println("내년에는 " + (age + 1) + "살이됩니다.");

        /*
            2. 다음과 같이 콘솔에 출력될 수 있도록 코드를 작성하시오.
            점수를 입력하세요 >>> 4,5
            이름을 입력하세요 >>> 김일
            김일 학생의 점수는 4.5입니다.
         */

//        System.out.print("점수를 입력하세요 >>> ");
//        double score = sc.nextDouble();
//        System.out.println("");
//        System.out.print("이름을 입력하세요 >>> ");
//        System.out.println("");
//        배리어 역할을 하는 nextLine() 사용
//        sc.nextLine();
//        String name = sc.nextLine();
//        String name = sc.next();
//        System.out.println(name + " 학생의 점수는 " + score + "입니다.");

        System.out.print("점수를 입력하세요 >>> ");
        String score = sc.nextLine();
        System.out.print("이름을 입력하세요 >>> ");
        String name = sc.nextLine();
        System.out.println(name + " 학생의 점수는 " + score + "입니다.");

        sc.close();
    }
}
