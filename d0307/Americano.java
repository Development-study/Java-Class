package d0307;

public class Americano extends Coffee {

    String water;
    String coffee;

    public Americano(String water, String coffee) {
        super("일반컵", 10, "기본빨대");
        this.water = water;
        this.coffee = coffee;
    }

    public void drink() {
        prepare();
        System.out.println(water + " : " + coffee + "로 만든 아메리카노를 마신다");
    }

}
