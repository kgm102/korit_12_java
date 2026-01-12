package ch18_generic.bmi;

public class CalcBmi {

    // BMI 계산 메서드
    public double calcBmi(Person person) {
        double heightMeter = person.getHeight() / 100.0; // cm → m
        return person.getWeight() / (heightMeter * heightMeter);
    }

    // 결과 출력 메서드
    public void printResult(Person person, double bmi) {
        String result;

        if (bmi < 18.5) {
            result = "저체중";
        } else if (bmi < 23) {
            result = "정상";
        } else if (bmi < 25) {
            result = "비만 전단계";
        } else if (bmi < 30) {
            result = "1단계 비만";
        } else if (bmi < 35) {
            result = "2단계 비만";
        } else {
            result = "3단계 비만";
        }

        System.out.printf(
                "%s 님의 키는 %.1f cm, 몸무게는 %.1f kg, bmi 지수는 %.2f 으로 %s입니다.%n",
                person.getName(), person.getHeight(), person.getWeight(), bmi, result
        );
    }
}
