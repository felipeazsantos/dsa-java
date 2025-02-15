package dev.felipeazsantos.likedlist;

import java.util.Objects;

public class MyLinkedList {

    private MyNode beginNode;

    public MyLinkedList() {
        this.beginNode = null;
    }

    public void insert(int element) {
        MyNode newNode = new MyNode();
        newNode.setElement(element);
        newNode.setNext(null);

        if (isEmpty()) {
            beginNode = newNode;
        } else {
            MyNode auxNode = beginNode;
            while(auxNode.getNext() != null) {
                auxNode = auxNode.getNext();
            }
            auxNode.setNext(newNode);
        }

    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("nothing to remove, list is empty");
        } else {
            int element = beginNode.getElement();
            beginNode = beginNode.getNext();
            return element;
        }
        return -1;
    }

    public void list() {
        if (isEmpty()) {
            System.out.println("nothing to show, list is empty");
        } else {
            MyNode auxNode = beginNode;
            while(auxNode != null) {
                System.out.println("Element: " + auxNode.getElement());
                auxNode = auxNode.getNext();
            }
        }

    }

    public boolean isEmpty() {
        return Objects.isNull(this.beginNode);
    }

}
