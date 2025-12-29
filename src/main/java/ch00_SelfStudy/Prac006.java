package ch00_SelfStudy;
// 조건 반복문
public class Prac006 {
    public static void main(String[] args) {

        int sum = 0;
        int count = 0;

        for (int i = 1; i < 101; i++){
            if(i % 3 == 0 && i % 5 == 0){
                sum += i;
                count++;
            }
        }

        System.out.println("3과 5의 공배수의 합 : "+sum);
        System.out.println("3과 5의 공배수 갯수 : " + count + "개");

    }
}
