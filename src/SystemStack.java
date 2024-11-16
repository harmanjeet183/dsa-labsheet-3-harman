package src;
public class SystemStack {
    public void simulateSystemStack() {
        ArrayStack callStack = new ArrayStack(10);
        callStack.push(1); 
        callStack.push(2);
        callStack.push(3);
    
        System.out.println("Current top of stack (peek): " + callStack.peek());
        callStack.pop();
        System.out.println("Top of stack after popping: " + callStack.peek());
    }

    public static void main(String[] args) {
        SystemStack systemStack = new SystemStack();
        systemStack.simulateSystemStack();
    }
}
