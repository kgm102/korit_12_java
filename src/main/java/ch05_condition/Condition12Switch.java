package ch05_condition;

import java.util.Scanner;

public class Condition12Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice;

        System.out.println("[ 메뉴 선택 ]");
        System.out.println("1. Java를 공부한다");
        System.out.println("2. JavaScript를 공부한다.");
        System.out.println("3. Python을 공부한다.");
        System.out.println("4. HTML을 공부한다.");
        System.out.println("5. 자습한다.");
        System.out.println("6. 오늘은 쉰다.");
        System.out.println("메뉴를 선택하세요 >>>");
        choice = sc.nextLine();

        switch (choice){
            case "a":
                System.out.println("메뉴 1을 선택하셨습니다.");
                break;
            case "b":
                System.out.println("메뉴 2을 선택하셨습니다.");
                break;
            case "c":
                System.out.println("메뉴 3을 선택하셨습니다.");
                break;
            case "d":
                System.out.println("메뉴 4을 선택하셨습니다.");
                break;
            case "e":
                System.out.println("메뉴 5을 선택하셨습니다.");
                break;
            case "f":
                System.out.println("메뉴 6을 선택하셨습니다.");
                break;
            default:
                System.out.println("불가능한 메뉴 선택입니다.");
        }
    }
}
