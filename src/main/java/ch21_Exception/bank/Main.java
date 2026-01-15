package ch21_Exception.bank;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static int balance = 10000;

    public static void withdraw(int amount) throws InsufficientBalanceException{
        if(amount > balance)
            throw new InsufficientBalanceException("잔액이 부족합니다.");
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("출금할 잔액을 입력해주세요 : ");
        int amount = sc.nextInt();
        try{
            withdraw(amount);
            System.out.println("출금이 정상적으로 처리되었습니다.");
        } catch (InsufficientBalanceException e){
            System.out.println(e.getMessage() + " (부족 금액) : " + (amount - balance) + "원");
        } catch (InputMismatchException e){
            System.out.println("숫자만 입력이 가능합니다");
        }finally {
            System.out.println("프로그램 정상 종료");
        }
    }
}
