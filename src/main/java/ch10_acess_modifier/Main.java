package ch10_acess_modifier;
class AccessModifierExample{
    public int publicVar = 10;
    protected int protectedVar = 20;
    int defalutVar = 30;
    private int privateVar = 30;

    public int getPrivateVar(){
        return privateVar;
    }
}

public class Main {
    public static void main(String[] args) {
        AccessModifierExample example = new AccessModifierExample();

        System.out.println(example.publicVar);
        System.out.println(example.protectedVar);
        System.out.println(example.defalutVar);
//        System.out.println(example.privateVar);
        System.out.println(example.getPrivateVar());
    }
}
