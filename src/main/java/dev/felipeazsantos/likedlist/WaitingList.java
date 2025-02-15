package dev.felipeazsantos.likedlist;

public class WaitingList {

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.insert(548);
        myLinkedList.insert(358);
        myLinkedList.insert(1487);
        myLinkedList.insert(5);
        myLinkedList.insert(98);
        myLinkedList.insert(487);
        myLinkedList.insert(2587);

        myLinkedList.list();

        System.out.println("-------------------------------------");
        while(!myLinkedList.isEmpty()) {
            System.out.println("removing from list: " + myLinkedList.remove());
        }
    }
}
