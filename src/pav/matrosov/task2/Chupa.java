package pav.matrosov.task2;

public class Chupa extends Sweet{

    private final int shugar;

    public Chupa(String name, double price, double weight, int shugar) {
        super(name, price, weight);
        this.shugar = shugar;
    }

    public int getShugar() {
        return shugar;
    }

    @Override
    public String toString() {
        return "Chupa{" +
                "shugar=" + shugar +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }
}
