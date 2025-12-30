package ch08_classes.students;

public class Student2 {
    int studentCode;
    String name;
    double score;

    public Student2() {
    }
    public Student2(String name) {
        this.name = name;
    }
    public Student2(int studentCode) {
        this.studentCode = studentCode;
    }
    public Student2(double score) {
        this.score = score;
    }

    public Student2(int studentCode, String name) {
        this.studentCode = studentCode;
        this.name = name;
    }

    public Student2(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public Student2(double score, int studentCode) {
        this.score = score;
        this.studentCode = studentCode;
    }

    public Student2(String name, double score, int studentCode) {
        this.name = name;
        this.score = score;
        this.studentCode = studentCode;
    }

    public Student2(int studentCode, String name, double score) {
        System.out.println("테스트");
        this.studentCode = studentCode;
        this.name = name;
        this.score = score;
    }
}
