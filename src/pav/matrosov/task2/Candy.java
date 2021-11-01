package pav.matrosov.task2;

public class Candy extends Sweet{

    private final int kakao;

    public Candy(String name, double price, double weight, int kakao) {
        super(name, price, weight);
        this.kakao = kakao;
    }

    public int getKakao() {
        return kakao;
    }

    @Override
    public String toString() {
        return "Candy{" +
                "kakao=" + kakao +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }

}
