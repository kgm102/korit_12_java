package ch07_methods;

public class FindMax {

    public static int Max(int a, int b, int c){
        int max = a;
        if(a < b){
            max = b;
            if(c > b){
                max = c;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int result = Max(4, 7, 9);
        System.out.println(result);
    }
}
