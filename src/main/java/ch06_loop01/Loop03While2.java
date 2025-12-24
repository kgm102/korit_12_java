package ch06_loop01;
/*
        중첩 while문(Nested - while)
        형식 :
        while(조건식1) {
            반복실행문1-a
            while(조건식2) {
                반복실행문2
            }
            반복실행문1-b
}
            예시
            1일차 1교시입니다.
            ...
            1일차 3교시입니다.
            ...
            5일차 1교시입니다.
            ...
            5일차 3교시입니다.
 */
public class Loop03While2 {
    public static void main(String[] args) {
        int day = 1;
        while (day < 6) {
            int lesson = 1;     // 반복실행문1-a
            while (lesson < 4) {
                System.out.println(day + "일차" + lesson + "교시입니다."); //반복실행문2
                lesson++;
            }
            day++; // 반복실행문 1-b
        }
//        System.out.println(lesson);
//        이상의 코드가 오류가 나는 이유는 추후 설명 예정이지만 도입된 개념은 scope(범위), global(전역), local(지역)에 해당합니다.

        /*
            이상의 중첩 while문을 분석하여
            2 x 1 = 2
            2 x 2 = 4
            ...
            9 x 9 = 81
         */

            int a = 2;
            int b = 1;
        while (a < 10) {
            while (b < 10) {
                System.out.println(a + " x " + b + " = " + (a * b));
                b++;
            }
            a++;
            b = 1;
            System.out.println();
        }





//        int i = 0;
//        int j = 0;
//
//        while (i < 5){
//
//            while (j < 3) {
//                System.out.println((i+1) + "일차" + (j+1) + "교시입니다.");
//                j++;
//            }
//            j = 0;
//            i++;
//        }

    }
}
