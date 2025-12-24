package ch06_loop01;
// 이 파일은 더블와일 테스트용이다.
public class Test {
    public static void main(String[] args) {
        /*
        1교시 1분
        1교시 2분
            ...
        1교시 50분
              10분 쉬는시간...
              1분
              2분
              3분
              ...
              10분
        2교시 1분
        ...
        5교시 50분
         */

        int i = 0;
        int j = 0;

        while (i < 5) {
            while (j < 61) {
                if (j < 50) {
                    System.out.println((i + 1) + "교시" + (j + 1) + "분");
                }else if(j == 50){
                    System.out.println("\t\t10분 쉬는시간");
                } else if (j < 61) {
                    System.out.println("\t\t"+(j-50) + "분");
                }
                j++;
            }
            j = 0;
            i++;

        }

    }
}

//            수정
//            while (j < 50) {
//                System.out.println((i + 1) + "교시 " + (j + 1) + "분");
//                j++;
//            }
//
//            System.out.println("\t\t10분 쉬는시간");
//
//            j = 1;
//            while (j <= 10) {
//                System.out.println("\t\t" + j + "분");
//                j++;
//            }
//             i++;
//        }


