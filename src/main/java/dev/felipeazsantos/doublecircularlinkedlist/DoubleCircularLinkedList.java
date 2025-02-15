package dev.felipeazsantos.doublecircularlinkedlist;

public class DoubleCircularLinkedList {
    private DoubleNode beginNode;

    public DoubleCircularLinkedList() {
        this.beginNode = null;
    }

    public boolean isEmpty() {
        return beginNode == null;
    }

    public void insert(int element) {
        DoubleNode newDoubleNode = new DoubleNode();
        newDoubleNode.setElement(element);

        if (isEmpty()) {
            newDoubleNode.setPrevious(newDoubleNode);
            newDoubleNode.setNext(newDoubleNode);
            beginNode = newDoubleNode;
        } else {
            DoubleNode auxNode = beginNode;
            while (auxNode.getNext() != beginNode) {
                auxNode = auxNode.getNext();
            }
            beginNode.setPrevious(newDoubleNode);
            auxNode.setNext(newDoubleNode);
            newDoubleNode.setPrevious(auxNode);
            newDoubleNode.setNext(beginNode);
        }
    }

    public void displayInOrder() {
        DoubleNode auxNode = beginNode;
        do {
            System.out.println("Reading Element: " + auxNode.getElement());
            auxNode = auxNode.getNext();
        } while(auxNode != beginNode);
    }

    public void displayInReverseOrder() {
        DoubleNode auxNode = beginNode.getPrevious();
        do {
            System.out.println("Reading Element reversed: " + auxNode.getElement());
            auxNode = auxNode.getPrevious();
        } while (auxNode != beginNode.getPrevious());
    }
}
