package dev.felipeazsantos.queue;

public class BankApp {

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.queue(57);
        myQueue.queue(150);
        myQueue.queue(14);
        myQueue.queue(589);
        myQueue.queue(1578);
        myQueue.queue(2);

        System.out.println("Welcome to BankApp");
        System.out.println("The customer always comes first");
        System.out.println("Treatment------------------------");
        while (!myQueue.isEmpty()) {
            System.out.println("Password to be answered at the counter: " + myQueue.dequeue());
        }
    }
}
