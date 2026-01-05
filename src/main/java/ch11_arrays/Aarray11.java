package ch11_arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Aarray11 {
    public static void main(String[] args) {
        Integer[] numbers = new Integer[10];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = random.nextInt();
        }
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers, Comparator.reverseOrder());
        System.out.println(Arrays.toString(numbers));

        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] * 10 + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(numbers));


        for(Integer num : numbers){
            System.out.print(num + " ");

        }


    }
}
