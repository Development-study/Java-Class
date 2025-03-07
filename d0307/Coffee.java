package d0307;

public class Coffee {

    String cup;
    int ice;
    String straw;

    public Coffee() {}

    public Coffee(String cup, String straw) {
        this.cup = cup;
        this.straw = straw;
    }

    public Coffee(String cup, int ice, String straw) {
        this.cup = cup;
        this.ice = ice;
        this.straw = straw;
    }

    public void prepare() {
        System.out.println("컵 : " + cup + " 얼음 개수 : " + ice + " 빨대 : " + straw);
    }

}
