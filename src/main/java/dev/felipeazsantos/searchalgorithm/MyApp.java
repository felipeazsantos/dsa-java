package dev.felipeazsantos.searchalgorithm;

import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        Scanner scannner = new Scanner(System.in);
        MyCollection collection = new MyCollection();
        int value, pos;

        do {
            System.out.println("Type a value to be search (-1 to exit)");
            value = scannner.nextInt();
            if (value != -1) {
                System.out.println(" >> Sequential Search: ");
                pos = collection.sequentialSearch(value);
                System.out.println(" >> Binary Search: ");
                pos = collection.binarySearch(value);
            }
        } while(value != -1);

        scannner.close();
    }

}
