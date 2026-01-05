package ch11_arrays;

public class Array05 {
    public static void addPlus(){
        String[] scores2 = {"A", "B", "C", "D", "F"};

        for(int i = 0; i < scores2.length-1; i++){
            System.out.print(scores2[i] + "+ /");
        }
        System.out.println(scores2[scores2.length-1]);
    }

    public static void main(String[] args) {
        String[] scores = {"A /", "B /", "C /", "D /", "F"};

        for(int i = 0; i < scores.length; i++){
            System.out.print(scores[i].replace(" /", "+ /"));
        }
        System.out.println();
    addPlus();
    }
}
