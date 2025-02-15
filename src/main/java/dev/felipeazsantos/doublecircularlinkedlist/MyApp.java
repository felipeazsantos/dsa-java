package dev.felipeazsantos.doublecircularlinkedlist;

public class MyApp {

    public static void main(String[] args) {
        DoubleCircularLinkedList list = new DoubleCircularLinkedList();
        list.insert(58);
        list.insert(187);
        list.insert(578);
        list.insert(69);
        list.insert(1578);
        list.insert(14);
        list.insert(155);
        list.insert(478);

        list.displayInOrder();
        System.out.println("----------------------------------------");
        list.displayInReverseOrder();

    }
}
