import java.util.NoSuchElementException;

public class LinkedListStack<T> {
    private Node<T> top;
    private int size;

    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }
    }

    public void push(T item) {
        top = new Node<>(item, top);
        size++;
    }

    public T pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Стек пустой");
        }
        T item = top.data;
        top = top.next;
        size--;
        return item;
    }

    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Стек пустой");
        }
        return top.data;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void reverseStack() {
        if (isEmpty()) {
            return;
        }

        Node<T> prev = null;
        Node<T> current = top;
        Node<T> next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        top = prev;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<T> currentNode = top;
        while (currentNode != null) {
            sb.append(currentNode.data).append(" ");
            currentNode = currentNode.next;
        }
        return sb.toString();
    }
}


