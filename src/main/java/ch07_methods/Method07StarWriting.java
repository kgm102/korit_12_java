package ch07_methods;

import java.util.Scanner;

/*
    별찍기 관련 부분을 저희가 메서드화 시켜볼 예정
 */
public class Method07StarWriting {


    public static String getStar(int row, int option) {
        String star = "";
        if (option > 4 || 1 > option) {
            return "잘못된 옵션 값입니다.";
        }
        if (option == 1) {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < i + 1; j++) {
                    star += "*";
                }
                star += "\n";
            }
        } else if (option == 2) {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < row - i; j++) {
                    star += " ";
                }
                for (int k = 0; k < i + 1; k++) {
                    star += "*";
                }
                star += "\n";
            }
        } else if (option == 3) {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < row - i; j++) {
                    star += "*";
                }
                star += "\n";
            }
        } else {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < i + 1; j++) {
                    star += " ";
                }
                for (int k = 0; k < row - i; k++) {
                    star += "*";
                }
                star += "\n";
            }
        }
        return star;
    }




    public static void main(String[] args) {
        // call4() -> 몇 줄 짜리 별 찍을건지

        Scanner sc = new Scanner(System.in);

        int rowOfStars = 0; // 몇 줄짜리 만들건지
        int  choice = 0; // 증가하는 별인지 감소하는 별인지
        String starResult = ""; // 별은 String 자료형이라서 이런식으로 선언 및 초기화

        System.out.println("몇 줄 짜리 별을 생성하시겠습니까?");
        rowOfStars = sc.nextInt();

        System.out.println("1. 왼쪽으로 치우친 증가하는 별");
        System.out.println("2. 오른쪽으로 치우친 증가하는 별");
        System.out.println("3. 왼쪽으로 치우친 감소하는 별");
        System.out.println("4. 오른쪽으로 치우친 감소하는 별");
        System.out.print("어떤 유형의 별을 생성하시겠습니까? >>> ");
        choice = sc.nextInt();
        System.out.println("줄 : "+rowOfStars + " " + "옵션 : " + choice);

        starResult = getStar(rowOfStars, choice);

        System.out.println(starResult);
    }
}
