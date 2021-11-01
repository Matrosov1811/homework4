package pav.matrosov.task2;

public class Task2 {
    public static void main(String[] args) {

        Chupa cupachups = new Chupa("cupachups", 16.2, 0.3, 100);
        Choko milka = new Choko("Milka", 30.2, 1, 5);
        Choko tablerone = new Choko("Tablerone", 100.7, 5, 0);
        Candy snikers = new Candy("Snikers", 50, 1.3, 43);

        Box presentBox = new Box(new Sweet[]{cupachups, milka, tablerone, snikers});

        System.out.println(presentBox);
        System.out.println("commonPrice: " + presentBox.getCommonPrice());
        System.out.println("commonWeight: " + presentBox.getCommonWeight());

    }
}