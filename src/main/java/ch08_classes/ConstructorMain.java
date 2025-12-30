package ch08_classes;

public class ConstructorMain {
    public static void main(String[] args) {
        Constructor constructor1 = new Constructor();
        Constructor constructor2 = new Constructor(2);
        System.out.println(constructor2.num);
        Constructor constructor3 = new Constructor(3);
        System.out.println(constructor3.num);

        Constructor constructor4 = new Constructor("김사");
        System.out.println(constructor4.name);

        Constructor constructor5 = new Constructor(5,"김오");
        System.out.println(constructor5.name);
        System.out.println(constructor5.num);

        System.out.println("-------------------");
        constructor5.displayInfo();

//        지시 사항 # 3
//        Car.java 파일 내에 있는 displayinfo() 메서드를 참조하여
//        constructor5.displayInfo();를 호출했을 경우
//        김오 학생의 학번은 5번 입니다.
//        를 콘솔에 출력할 수 있도록 Constructor.java에 displayInfo() 메서드를 call1() 유형으로
//                작성하고
//        ConstructorMain에서 호출하세요.

    }
}
