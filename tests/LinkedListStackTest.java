package tests;
import src.LinkedListStack;

public class LinkedListStackTest {
    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();
        stack.push(1);
        stack.push(2);
        stack.pop();
        System.out.println(stack.peek());
    }   
}
