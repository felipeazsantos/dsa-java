package dev.felipeazsantos.stack;

public class MyNode {

    private int element;
    private MyNode next;

    public void setElement(int element) {
        this.element = element;
    }

    public int getElement() {
        return this.element;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }

    public MyNode getNext() {
        return this.next;
    }
}
