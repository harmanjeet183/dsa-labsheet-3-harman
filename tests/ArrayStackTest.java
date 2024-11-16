package tests;
import src.ArrayStack;

public class ArrayStackTest {
    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack(5);
        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.pop();
        System.out.println(arrayStack.peek());
    }
}
