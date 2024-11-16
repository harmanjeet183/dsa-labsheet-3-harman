package src;
public class ReverseData {

    // Method to reverse a string using Stack
    public String reverseString(String input) {
        ArrayStack charStack = new ArrayStack(input.length());
        for (char c : input.toCharArray()) {
            charStack.push(c);
        }
        StringBuilder reversed = new StringBuilder();
        while (!charStack.isEmpty()) {
            reversed.append((char) charStack.pop());
        }
        return reversed.toString();
    }   
}
