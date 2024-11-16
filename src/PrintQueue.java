package src;

public class PrintQueue {
    private String[] queue;
    private int front, rear, size, capacity;

    public PrintQueue(int capacity) {
        this.capacity = capacity;
        queue = new String[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Method to add a document to the print queue
    public void enqueue(String document) {
        if (size == capacity) {
            System.out.println("Queue Overflow: Cannot add document, the queue is full.");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = document;
        size++;
    }

    // Method to process (dequeue) a document from the print queue
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("No documents to process. The queue is empty.");
            return;
        }
        System.out.println(queue[front]);
        front = (front + 1) % capacity;
        size--;
    }
    

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Method to peek at the next document in the queue
    public String peekDocument() {
        if (isEmpty()) {
            return null;
        }
        return queue[front];
    }
}
