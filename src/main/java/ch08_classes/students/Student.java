package ch08_classes.students;

public class Student {
    int studentCode;
    String name;
    double score;

    public Student(){
        System.out.println("기본 생성자로 객체를 생성했습니다.");
    }
    public Student(int studentCode){
        System.out.println("int 매개변수 생성자로 객체를 생성했습니다.");
        this.studentCode = studentCode;
    }
    public Student(String name){
        System.out.println("String 매개변수 생성자로 객체를 생성했습니다.");
        this.name = name;
    }
    public Student(int studentCode, String name){
        System.out.println("int, String 매개변수 생성자로 객체를 생성했습니다.");
        this.studentCode = studentCode;
        this.name = name;
    }
    public  Student(int studentCode, String name, double score){
        System.out.println("int, String, double 매개변수 생성자로 객체를 생성했습니다.");
        this.studentCode = studentCode;
        this.name = name;
        this.score = score;
    }

    public void showInfo(){
        System.out.println(name + " 학생의 정보입니다.");
        System.out.println("학번 : " + studentCode);
        System.out.println("이름 : " + name);
        System.out.println("점수 : " + score);
        System.out.println();
    }
}
