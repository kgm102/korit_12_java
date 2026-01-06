package ch11_arrays;

import java.util.Arrays;
import java.util.Random;

public class Array15Lotto {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr01 = new int[6];
        int ball = 0;

        for (int k = 0; k < 10; k++) {
            for (int i = 0; i < arr01.length; i++) {
                while (true) {
                    ball = random.nextInt(45) + 1;
                    boolean isDuplicate = false;

                    for (int j = 0; j < arr01.length; j++) {
                        if (arr01[j] == ball) {
                            isDuplicate = true;
                            break;
                        }
                    }
                    if (!isDuplicate) {
                        arr01[i] = ball;
                        break;
                    }
                }
            }
            Arrays.sort(arr01);
            System.out.println(Arrays.toString(arr01));
        }
    }
}

