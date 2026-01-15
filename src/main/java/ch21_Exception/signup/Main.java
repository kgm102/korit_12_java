package ch21_Exception.signup;

import java.util.Scanner;

public class Main {
    public static void checkId(String id) throws InvalidIdException{
        if(id.length() < 8){
            throw new InvalidIdException("아이디는 8자 이상이어야 합니다.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("생성할 아이디를 입력해주세요 : ");
        try{
            String id = sc.nextLine().trim();
            checkId(id);
            System.out.println("아이디가 성공적으로 생성되었습니다 : " + id);
        }catch (InvalidIdException e){
            System.out.println("오류 : " + e.getMessage());
        }finally {
            System.out.println("프로그램 종료");
        }
    }
}
