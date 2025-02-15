package dev.felipeazsantos.sortingalgorithm;

import java.time.Duration;
import java.time.LocalDateTime;

public class Sorting {
    private int[] values = {25, 57, 48, 37, 12, 92, 33};

    public void setValues(int[] values) {
        this.values = values;
    }

    public void bubbleSort() {
        int it, pos, temp;
        System.out.println("performing bubbleSort in values of " + values.length + " elements");
        LocalDateTime now = LocalDateTime.now();
        for (it = 0; it < values.length; it++) {
            for (pos = 0; pos < (values.length - it - 1); pos++) {
                if (values[pos] > values[pos +1]) {
                    temp = values[pos];
                    values[pos] = values[pos+1];
                    values[pos+1] = temp;
                }
            }
        }
        LocalDateTime end = LocalDateTime.now();
        System.out.println("done in: " + Duration.between(now, end).getSeconds() + " seconds\n\n");
    }

    public void displayValues() {
        for (int value : values) {
            System.out.print(value + "  ");
        }
        System.out.println("");
    }

}
