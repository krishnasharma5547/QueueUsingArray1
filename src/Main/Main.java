package Main;

import Operations.MyArray;

public class Main {
    public static void main(String[] args) {
        MyArray arr = new MyArray(6);
        arr.enqueue(10);
        arr.enqueue(20);
        arr.enqueue(30);
        arr.enqueue(40);
        arr.enqueue(50);
        arr.printQueue();
        System.out.println("\n");
        arr.peekIn();
        arr.dequeue();
        arr.printQueue();
    }
}
