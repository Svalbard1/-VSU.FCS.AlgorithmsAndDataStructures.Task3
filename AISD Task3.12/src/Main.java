import java.util.Stack;

import static java.util.Collections.reverse;

public class Main {
    public static void main(String[] args) {
        Stack<String> javaStack = new Stack<>();
        javaStack.push("Мы");
        javaStack.push("Bebra");
        javaStack.push("IT");
        javaStack.push("Company");

        LinkedListStack<String> customStack = new LinkedListStack<>();
        customStack.push("Мы");
        customStack.push("Bebra");
        customStack.push("IT");
        customStack.push("Company");

        System.out.println("Исходный стек: " + javaStack);

        reverse(javaStack);

        System.out.println("Перевёрнутый стек: " + javaStack);

        System.out.println("Исходный стек: " + customStack);

        customStack.reverseStack();

        System.out.println("Перевёрнутый стек: " + customStack);
    }
}