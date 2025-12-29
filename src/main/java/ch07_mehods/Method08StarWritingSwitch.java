package ch07_mehods;

import java.util.Scanner;

public class Method08StarWritingSwitch {

    public static String getStar(int row, int option){
        int choice = option;
        String star = "";

        switch (choice) {
            case 1:
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < i + 1; j++) {
                        star += "*";
                    }
                    star += "\n";
                }
                break;
            case 2:
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < row - i; j++) {
                        star += " ";
                    }
                    for (int k = 0; k < i + 1; k++) {
                        star += "*";
                    }
                    star += "\n";
                }
                break;
            case 3:
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < row - i; j++) {
                        star += "*";
                    }
                    star += "\n";
                }
                break;
            case 4:
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < i + 1; j++) {
                        star += " ";
                    }
                    for (int k = 0; k < row - i; k++) {
                        star += "*";
                    }
                    star += "\n";
                }
                break;
            default:
                star += "잘못된 옵션 값입니다.";
                break;
        }
        return star;
    }





    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("몇 줄짜리 별을 생성하시겠습니다?");
        int row = sc.nextInt();
        String starResult = "";

        System.out.println("1. 왼쪽으로 치우친 증가하는 별");
        System.out.println("2. 오른쪽으로 치우친 증가하는 별");
        System.out.println("3. 왼쪽으로 치우친 감소하는 별");
        System.out.println("4. 오른쪽으로 치우친 감소하는 별");
        System.out.println("어떤 유형의 별을 만들고 싶으십니까?");
        int option = sc.nextInt();

        starResult = getStar(row,option);

        System.out.println(getStar(row,option));
    }
}
