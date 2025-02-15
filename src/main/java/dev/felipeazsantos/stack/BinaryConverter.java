package dev.felipeazsantos.stack;

public class BinaryConverter {

    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        IStack stack = new DynamicStack();

        while (number != 0) {
            int rest = number % 2;
            stack.push(rest);
            number /= 2;
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
