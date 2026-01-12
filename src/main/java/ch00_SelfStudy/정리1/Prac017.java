package ch00_SelfStudy.정리1;

import java.util.Arrays;
import java.util.Random;

public class Prac017 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] arr01 = {{1,2,3},{4,5,6},{7,8,9}};

        for(int i= 0; i < arr01.length; i++){
            for(int j = 0; j < arr01[i].length; j++){
                System.out.print(arr01[i][j] + " ");
            }
        }
        System.out.println();

        int[][] arr02 = new int[3][4];

        for(int i = 0; i < arr02.length; i++){
            for(int j = 0; j < arr02[i].length; j++){
                arr02[i][j] = random.nextInt(10);
                System.out.print(arr02[i][j] + " ");
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(arr02));
    }
}
