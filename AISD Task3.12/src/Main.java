import java.util.Stack;

import static java.util.Collections.reverse;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Мы");
        stack.push("Bebra");
        stack.push("IT");
        stack.push("Company");

        System.out.println("Исходный стек: " + stack);

        reverse(stack);

        System.out.println("Перевёрнутый стек: " + stack);
//        System.out.println("Перевёрнутый стек: " + StackReverse.reverseStack(stack));
    }
}