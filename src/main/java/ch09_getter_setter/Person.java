package ch09_getter_setter;

public class Person {
    // field
    String name;
    int age;
    String address;

    public Person() {

    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 4) {
            System.out.println("변경할 수 없습니다.");
            return;
        } else if (name.length() < 4) {
            System.out.println("이름이 변경되었습니다.");
            System.out.println("변경 전 : " + this.name);
            this.name = name;
            System.out.println("변경 후 : " + this.name);
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}




