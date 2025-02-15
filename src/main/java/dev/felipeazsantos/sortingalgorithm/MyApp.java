package dev.felipeazsantos.sortingalgorithm;

public class MyApp {

    public static void main(String[] args) {
        Sorting sorting = new Sorting();
        int[] values = ValuesGenerator.generate(100000);
        sorting.setValues(values);
        sorting.bubbleSort();
        sorting.displayValues();
    }
}
