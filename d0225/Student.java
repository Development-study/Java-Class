package d0225;

public class Student {

    String name;
    int age;
    String gender;

    void print() {
        System.out.println("Name: " + name);
        System.out.println("age: " + age);
        System.out.println("gender: " + gender);
    }

    int getAge() {
        return age;
    }

}