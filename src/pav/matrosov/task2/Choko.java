package pav.matrosov.task2;

public class Choko extends Sweet {

    private final int nuts;

    public Choko(String name, double price, double weight, int nuts) {
        super(name, price, weight);
        this.nuts = nuts;
    }

    public int getNuts() {
        return nuts;
    }

    @Override
    public String toString() {
        return "Choko{" +
                "nuts=" + nuts +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }
}
