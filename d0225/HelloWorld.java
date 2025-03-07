package d0225;

public class HelloWorld {

    public static void main(String[] args) {
        Student student = new Student();
        student.name = "연서";
        student.age = 20;
        student.gender = "여자";

        student.print();
        int studentAge = student.getAge();

        System.out.println(studentAge);
    }

}