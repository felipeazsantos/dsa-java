package dev.felipeazsantos.queue;

public class MyQueue {

    private final int[] values;
    private int begin;
    private int end;
    private int total;

    public MyQueue() {
        values = new int[10];
        begin = 0;
        end = 0;
        total = 0;
    }

    public void queue(int element) {
        values[end] = element;
        end = (end + 1) % values.length;
        total++;
    }

    public int dequeue() {
        int element = values[begin];
        begin = (begin + 1) % values.length;
        total--;
        return element;
    }

    public boolean isEmpty() {
        return total == 0;
    }

}
