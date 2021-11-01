package pav.matrosov.task2;

import java.util.Arrays;
import java.util.Scanner;

public class Box {

    private double commonPrice;
    private double commonWeight;
    private final Sweet[] sweets;


    public Box(Sweet[] sweets) {
        this.sweets = sweets;
    }

    public Sweet[] getSweets() {
        return sweets;
    }

    @Override
    public String toString() {
        StringBuilder print = new StringBuilder("sweets: {\n");
        for (Sweet sweet :
                sweets) {
           print.append(sweet.toString())
                   .append("\n");
        }
        print.append("}");
        return print.toString();
    }

    public double getCommonPrice() {
        for (Sweet sweet :
                sweets) {
            commonPrice += sweet.price;
        }
        return commonPrice;
    }
    public double getCommonWeight() {
        Arrays.stream(sweets).forEach(sweet -> {
            commonWeight += sweet.weight;
        });
        return commonWeight;
    }
}
