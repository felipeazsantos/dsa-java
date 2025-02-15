package dev.felipeazsantos.stack;

public class DynamicStack implements IStack {

    private MyNode topNode;

    public DynamicStack() {
        this.topNode = null;
    }

    public void push(int element) {
        MyNode newNode = new MyNode();
        newNode.setElement(element);
        newNode.setNext(topNode);
        topNode = newNode;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("cannot pop, list is empty");
            return -1;
        } else {
            int element = topNode.getElement();
            topNode = topNode.getNext();
            return element;
        }
    }

    public boolean isEmpty() {
        return this.topNode == null;
    }
}
