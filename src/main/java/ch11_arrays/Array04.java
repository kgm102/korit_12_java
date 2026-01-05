package ch11_arrays;

public class Array04 {

    public static void printElement(String[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " / ");
        }
    }

    public static void main(String[] args) {
        String[] titles = {"김일", "김이", "김삼"};

        for (int i = 0; i < titles.length; i++){
            System.out.print(titles[i] + " / ");
        }
        System.out.println();
        printElement(titles);
    }
}
