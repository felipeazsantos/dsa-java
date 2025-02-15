package dev.felipeazsantos.stack;

public class DynamicStack implements IStack {

    private MyNode topNode;

    public DynamicStack() {
        this.topNode = null;
    }

    public void push(int element) {
        MyNode newNode = new MyNode();
        newNode.setElement(element);

        if (isEmpty()) {
            topNode = newNode;
        } else {
            MyNode auxNode = topNode;
            topNode = newNode;
            newNode.setNext(auxNode);
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("cannot pop, list is empty");
        } else {
            int element = topNode.getElement();
            topNode = topNode.getNext();
            return element;
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.topNode == null;
    }
}
