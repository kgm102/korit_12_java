package ch11_arrays;

public class Array06 {
    public static int calcSum(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }

    public static double calcAvg(int[] arr){
        int sum = 0;
        double avg = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        avg = (double)sum / arr.length;
        return avg;
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

        System.out.println("총합 : " + calcSum(scores) + "점");
        System.out.println("평균 : " + calcAvg(scores) + "점");
    System.out.println();
    printSumAndAvg(scores);
    }
}
