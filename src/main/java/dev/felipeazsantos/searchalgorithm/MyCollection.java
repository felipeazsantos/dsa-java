package dev.felipeazsantos.searchalgorithm;

public class MyCollection {
//    private int[] values = {12, 56, 87, 23, 96, 43, 27, 76, 33, 11};
    private int[] values = {11, 12, 23, 27, 33, 43, 56, 76, 87, 96};

    public int sequentialSearch(int value) {
        int iterations = 0;
        for (int pos = 0; pos < values.length; pos++) {
            iterations++;
            if (value == values[pos]) {
                System.out.println("Iterations: " + iterations);
                return pos;
            }
        }
        System.out.println("iterations: " + iterations);
        return -1;
    }

    public int binarySearch(int value) {
        int middle, begin, end;
        begin = 0;
        end = values.length - 1;
        int iterations = 0;

        while (begin < end) {
            iterations++;
            middle = (begin + end) / 2;
            if (value == values[middle]) {
                System.out.println("iterations: " + iterations);
                return middle;
            } else {
                if (value > values[middle]) {
                    begin = middle+1;
                } else {
                    end = middle-1;
                }
            }
        }
        System.out.println("iterations: " + iterations);
        return -1;
    }

}
