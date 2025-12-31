package ch11_arrays;

public class Array01 {
    public static void main(String[] args) {
        int[] arr01 = {1, 2, 3, 4, 5};
        System.out.println(arr01);

        System.out.print(arr01[0]);
        System.out.print(arr01[1]);
        System.out.print(arr01[2]);
        System.out.print(arr01[3]);
        System.out.print(arr01[4]);
        System.out.println();
        //for 문을 통해서 arr01에 있는 내부 요소를 콘솔에 출력하시오

        for(int i = 0; i < arr01.length; i++){
            System.out.print(arr01[i] + " ");

            int[] arr03 = new int[10];
            System.out.println();
        }
        int[] arr04 = new int[40];

        for(int i = 0; i < arr04.length; i++) {
            arr04[i] = i+41;
            System.out.print(arr04[i] + " / ");
        }
        System.out.println();
        String[] arr05 = {"안", "녕", "하", "세", "요"};

        for(int i = 0; i < arr05.length; i++){
            System.out.print(arr05[i]);
        }



    }
}
