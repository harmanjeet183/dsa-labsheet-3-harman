package src;
public class ArrayStack {
    private int[] stack;
    private int top;
    private int size;

    public ArrayStack(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    // Method to add an element to the stack
    public void push(int value) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = value;
    }

    // Method to remove an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }

    // Method to peek at the next element in the stack
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }
}
