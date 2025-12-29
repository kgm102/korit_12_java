package ch08_classes;
/*
    생성자(Constructor)
    생성자는 객체착 생성될 때 호출되는 특별한 '메서드
    객체 생성 예시
    클래스명 객체명 = new클래스명();
    ClassExample example = new ClassExample();
    : 사실 ClassExample()가 생성자에 해당됩니다.

    특징 :
        1. 클래스의 이름과 생성자닁 읾은 동일하다.
        (다른 메서드들과 달리 Pascal case로 작성되죠,
        그리고 아ㅏㄱ 수어업에서 들었따면 meathod는 동사로 시작되는데,
        얘는 클래스 이름이랑 똑같으니 명사겠네요.
        2. return 값이 없습니다. -> call(), call2() 유형으로 생각할 수 있음.
        3. 객체 초기화 : 생성자는 객체의 필드 '초기화'를 담당한다.

        생성자 정의 방식 :
            1. 기본 생성자 : 매개변수가 없느 생성자
            (근데 얘는 클래스를 만들 때 default로 생성되기 때문에 정의하지 않아도
            될 때가 있습니다. 저희가 Car() 어쩌고 메서드를 만들지 않았죠)
            즉, default로 생성된 기본 생성자를 이용하여 객체를 생성했습니다.
            2. 매개변수 생성자 : 하나 이상의 매개변수를 가지는 생성자
 */
public class Constructor {
    int num;
    String name;

    public Constructor() {
        System.out.println("NoArgsConstructor(기본생성자)");
    }

    public Constructor(int number) {
        System.out.println("RequiredArgsConstructor(int 매개변수를 필수로 요구하는 생성자)");
        this.num = number;
    }


}




