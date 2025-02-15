package dev.felipeazsantos.stack;

public class Stack {

    private final int[] values;
    private int top;

    public Stack() {
        this.values = new int[10];
        this.top = -1;
    }

    public void push(int element) {
        top++;
        values[top] = element;
    }

    public int pop() {
        int element = values[top];
        top--;
        return element;
    }

    public boolean isEmpty() {
        return top == -1;
    }

}
