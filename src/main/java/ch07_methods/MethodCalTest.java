package ch07_methods;

public class MethodCalTest {

    public static int cal(int a, int b){
        int result = a + b;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(cal(5,4));
    }
}
