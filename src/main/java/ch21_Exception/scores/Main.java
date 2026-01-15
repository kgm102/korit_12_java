package ch21_Exception.scores;

import java.util.Scanner;

public class Main {
    public static void checkScore(int score) throws  InvalidScoreException{
        if(score < 0 || 100 < score){
            throw new InvalidScoreException("점수는 0~100점 사이여야 합니다.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력하세요 : ");

        try {
            int score = sc.nextInt();
            checkScore(score);
            System.out.println("점수가 성공적으로 저장되었습니다.");
        } catch (InvalidScoreException e){
            System.out.println(e.getMessage());
        }
    }
}
