package ch10_acess_modifier;


class Person{
    private String name; // Person 클래스 에서만 사용가능

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() > 4){
            System.out.println("글자 수 제한을 넘어섰습니다");
            return;
        }else {
            this.name = name;
            System.out.println("이름이 " + this.name + " 로 설정되었습니다.");
        }
    }
}


public class PersonMain {
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.setName("김일");
        person1.setName("브래드피트");
        person1.setName("이일");
        String name = person1.getName();
        System.out.println("현재 이름 : " + name);
    }
}
