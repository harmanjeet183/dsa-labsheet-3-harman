package tests;
import src.PrintQueue;

public class PrintQueueTest {
    public static void main(String[] args) {
        PrintQueue printQueue = new PrintQueue(5);
        printQueue.enqueue("doc1");
        printQueue.enqueue("doc2");
        printQueue.dequeue();
    }
}
