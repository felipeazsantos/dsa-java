package dev.felipeazsantos.doublecircularlinkedlist;

public class DoubleNode {

    private int element;
    private DoubleNode previous;
    private DoubleNode next;

    public int getElement() {
        return element;
    }

    public void setElement(int element) {
        this.element = element;
    }

    public DoubleNode getPrevious() {
        return previous;
    }

    public void setPrevious(DoubleNode previous) {
        this.previous = previous;
    }

    public DoubleNode getNext() {
        return next;
    }

    public void setNext(DoubleNode next) {
        this.next = next;
    }
}
