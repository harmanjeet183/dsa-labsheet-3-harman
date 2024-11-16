package tests;

import src.ArrayQueue;

public class ArrayQueueTest {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.dequeue();
        System.out.println(queue.peek());
    }
}
