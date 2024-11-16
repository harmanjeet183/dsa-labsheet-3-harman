package src;
public class ArrayQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;

    public ArrayQueue(int size) {
        this.size = size;
        queue = new int[size];
        front = -1;
        rear = -1;
    }


    // Method to add an element to the queue
    public void enqueue(int value) {
        if (rear == size - 1) {
            System.out.println("Queue Overflow");
            return;
        }
        if (front == -1) front = 0;
        queue[++rear] = value;
    }

    // Method to remove an element from the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int value = queue[front++];
        if (front > rear) {
            front = rear = -1;
        }
        return value;
    }

    // Method to peek at the next element in the queue
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front];
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return front == -1;
    }
}
