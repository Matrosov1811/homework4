package pav.matrosov.task1;

import java.util.Arrays;

public class Task1 {

        public static void main(String[] args) {
            int[] arr = RandomArray();
            int max_negative = Integer.MIN_VALUE;
            int min_positive = Integer.MAX_VALUE;
            int positive = 0, negative = 0;
            int x;
            for (int i = 0; i < arr.length; i++) {
                if ((arr[i] < 0) && (max_negative < arr[i])) {
                    max_negative = arr[i];
                    negative = i;
                }
                if ((arr[i] > 0) && (min_positive > arr[i])) {
                    min_positive = arr[i];
                    positive = i;
                }
            }
            System.out.printf("Min positive: %d\n", min_positive);
            System.out.printf("Max negative: %d", max_negative);
            x = arr[negative];
            arr[negative] = arr[positive];
            arr[positive] = x;

            System.out.println("\nArray after replace:");
            System.out.println(Arrays.toString(arr));

        }

        private static int[] RandomArray() {
            int[] mas = new int[20];
            for (int i = 0; i < 20; i++) {
                mas[i] = (int) ((Math.random() * 20) - 10);
            }
            System.out.println("\nArray before replace:");
            System.out.println(Arrays.toString(mas));
            return mas;
        }
    }

