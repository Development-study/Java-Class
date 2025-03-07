package d0307;

public class CafeLatte extends Coffee {

    String milk;
    String sugar;
    String coffee;

    public CafeLatte (String milk, String sugar, String coffee){
        super("기본컵", 13,  "기본빨대");
        this.milk = milk;
        this.sugar = sugar;
        this.coffee = coffee;
    }

    public void drink() {
        prepare();
        System.out.println(milk + ":" + sugar + ":" +coffee + "로 만든 커피를 마신다");
    }

}
