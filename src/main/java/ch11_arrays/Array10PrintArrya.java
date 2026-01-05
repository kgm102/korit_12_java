package ch11_arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Array10PrintArrya {
    public static void main(String[] args) {
//        Random random = new Random();
//        Scanner sc = new Scanner(System.in);
//        int num1 = random.nextInt();
//        System.out.println("숫자를 입력하세요 >>>");
//        int num2 = sc.nextInt();
//        System.out.println(num1);
//        System.out.println(num2);

        int[] numbers = {1, 2, 3, 4, 5, 6 ,7, 8, 9, 10};

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.asList(numbers).toString());

        int[] nums ={3,6, 7,1, 9, 2, 10 , 5, 4, 8};
        System.out.println("정렬 전 배열 : " + Arrays.toString((nums)));
        Arrays.sort(nums);
        System.out.println("오름 차순 정렬 후 배열 : " + Arrays.toString((nums)));
        /*
            sort()를 ctrl + 클릭 해보니까 return 타입이 void입니다.
            즉 여기서 알 수 있는 점은 nums 원본 배열을 통째로 바꿨다는 점이다.
         */
//        System.out.println(Arrays.toString(Arrays.sort(nums)));



    }
}
