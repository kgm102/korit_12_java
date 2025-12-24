package ch06_loop01;
/*
    Nested for - loop
    for( 시작값 ; 한계값 ; 증감값) {
        실행문1-a
        for( 시작값; 한계값; 증감값){
            실행문2
        }
    }
 */
public class Loop07Star {
    public static void main(String[] args) {

//        for(int i = 0; i < 5; i++){
//            for(int j = 0; j < i+1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

//        for(int i = 100; i > 0; i--){
//            System.out.println(i);
//        }


    }
}
