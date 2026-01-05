package ch11_arrays;

public class Array06 {
    public static void calcSum(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println("총점 : " + sum);
    }

    public static void calcAvg(int[] arr){
        int sum = 0;
        double avg = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        avg = (double)sum / arr.length;
        System.out.println("평균 : " + avg);
    }

    public static void printSumAndAvg(int[] arr){
        int sum = 0;
        double avg = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        avg = (double)sum / arr.length;
        System.out.println("총합 : " + sum + "점");
        System.out.println("평균 : " + avg + "점");
    }

    public static void main(String[] args) {
    int[] scores = {100, 90, 80, 70, 60, 50, 40, 30, 20, 10};

    calcSum(scores);
    calcAvg(scores);
    System.out.println();
    printSumAndAvg(scores);
    }
}
