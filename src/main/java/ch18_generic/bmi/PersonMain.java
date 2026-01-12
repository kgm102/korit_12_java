package ch18_generic.bmi;

import ch14_casting.animal.Dog;

public class PersonMain {
    public static void main(String[] args) {
        // Person 객체 생성
        Person person = new Person("김일", 168, 64);

        // CalcBmi 객체 생성
        CalcBmi calcBmi = new CalcBmi();

        // BMI 계산
        double bmi = calcBmi.calcBmi(person);

        // 결과 출력
        System.out.println(bmi);
        calcBmi.printResult(person, bmi);


    }
}
