package d0307;

public class Main {

    public static void main(String[] args) {
        Americano americano = new Americano("에비앙", "고소한거");
        americano.drink();

        CafeLatte cafeLatte = new CafeLatte( "저지방 우유", "달달한", "고소한거");
        cafeLatte.drink();
    }

}
