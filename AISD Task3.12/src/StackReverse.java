import java.util.Stack;

public class StackReverse {

    public static Stack<String> reverseStack(Stack<String> stack) {
        Stack<String> flipStack = new Stack<>();

        while (!stack.empty()) {
            String element = stack.pop();
            flipStack.push(element);
        }

        stack = flipStack;

        return stack;
    }
}
