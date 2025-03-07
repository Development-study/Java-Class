package d0225;

public class Zoo {

    public static void main(String[] args) {
        Lion lion = new Lion(); // 사자 인스턴스 변수
        lion.name = "사자";
        lion.age = 100;

        lion.print();


        Monkey monkey = new Monkey();
        monkey.name = "원숭이";
        monkey.age = 25;

        monkey.print();
    }

}

class Lion {

    String name; // 동물의 이름
    int age; // 동물의 나이

    void print() { // 동물의 정보를 출력하는 동작
        System.out.println(name);
        System.out.println(age);
    }

    int getAge() { // 동물의 나이를 반환하는 동작
        return age;
    }

}

class Monkey{

    String name;
    int age;

    void print() {
        System.out.println(name);
        System.out.println(age);
    }

    int getAge() {
        return age;
    }
}