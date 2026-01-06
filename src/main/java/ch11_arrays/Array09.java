package ch11_arrays;

public class Array09 {
    public static void main(String[] args) {

        String[] names = {"김일", "김이", "김삼", "김사", "김오"};

        for(int i = 0; i < names.length; i++){
            System.out.println((i+1) + "번 : " + names[i] + " ");
        }
        System.out.println();

        int index = 1;
        for(String name : names){
            System.out.println(index + "번 : " + name + " ");
            index++;
        }

    }
}
