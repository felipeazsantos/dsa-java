package dev.felipeazsantos.sortingalgorithm;

public class ValuesGenerator {
    static int[] values;

    public static boolean contains(int value, int len) {
        for (int i=0; i < len; i++) {
            if (value == values[i]) {
                return true;
            }
        }
        return false;
    }

    public static int[] generate(int len) {
        values = new int[len];
        int value, pos;
        for (pos = 0; pos < values.length; pos++) {
            do {
                value = (int) (Math.random() * 100000) % 100000;
            } while(contains(value, pos));
            values[pos] = value;
        }
        return values;
    }

    public static void main(String[] args) {
        int pos;
        int[] values = generate(10);

        for (pos = 0; pos < values.length; pos++) {
            System.out.println(values[pos]);
        }
    }
}
