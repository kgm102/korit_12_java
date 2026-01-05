package ch11_arrays;

import java.util.Arrays;

public class Array07 {
    public static void main(String[] args) {
        int[] scores = {100, 97, 83, 85, 77, 76, 64, 64, 58, 59, 92, 100};
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int f = 0;

        for(int i = 0; i < scores.length; i++){
            if(scores[i] >= 90){
                a++;
            } else if (scores[i] >= 80) {
                b++;
            } else if (scores[i] >= 70) {
                c++;
            } else if (scores[i] >= 60) {
                d++;
            } else {
                f++;
            }
        }
        System.out.println("A등급 : " + a + "명");
        System.out.println("B등급 : " + b + "명");
        System.out.println("C등급 : " + c + "명");
        System.out.println("D등급 : " + d + "명");
        System.out.println("F등급 : " + f + "명");
        System.out.println();

        int[] grades = new int[5];

        for(int i = 0; i < scores.length; i++){
            if(scores[i] >= 90){
                grades[0]++;
            } else if (scores[i] >= 80) {
                grades[1]++;
            } else if (scores[i] >= 70) {
                grades[2]++;
            } else if (scores[i] >= 60) {
                grades[3]++;
            } else {
                grades[4]++;
            }
        }

        System.out.println("A등급 : " + grades[0] + ", B등급 : " + grades[1] + ", C등급 : " + grades[2] + ", D등급 : " + grades[3] + ", F등급 : " + grades[4]);


    }
}
