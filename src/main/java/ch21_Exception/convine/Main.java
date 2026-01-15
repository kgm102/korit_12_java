package ch21_Exception.convine;

import java.util.Scanner;



public class Main {
    public static void order(int quantity) throws InvalidOrderQuantityException{
        if(quantity < 1 || quantity > 50){
            throw new InvalidOrderQuantityException("수량이 잘못되었습니다.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("주문 수량을 입력하세요 >>> ");
        int a = sc.nextInt();


        try{
            order(a);
        }catch (InvalidOrderQuantityException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("주문 프로세스 완료");
        }

    }
}
