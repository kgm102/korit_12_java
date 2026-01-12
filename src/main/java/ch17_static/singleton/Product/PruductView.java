package ch17_static.singleton.Product;

public class PruductView {
    // 정적 변수를 선언 field
    // 보통 싱글톤 패턴 만들 때 정적 변수 이름이 instance입니다.
    // -> 24년 1회 실기 시험시 field 명도 힌트였었습니다.
    private static PruductView instance;
    public static int count = 1;

    // 생성자
    private PruductView(){
        int cnt = 1;    // 객체 생성 시에 사용되는 field.
        System.out.println(cnt + " 번 째 객체가 생성되었습니다.");
        cnt++;
        System.out.println("정적 변수를 참조하는 " + count + " 번 째 객체가 생성되었습니다.");
        count++;
    }

    public static PruductView getInstance() {
        if (instance == null){
            instance = new PruductView();
        }
        return instance;
    }
}
