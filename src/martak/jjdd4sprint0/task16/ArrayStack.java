package martak.jjdd4sprint0.task16;

import java.util.Arrays;

public class ArrayStack<T> implements Stack<T> {

    private T[] stack;
    private int top;

    private static final int maxSize = 5;

    public ArrayStack() {
        this.stack = (T[]) new Object[maxSize];
        this.top = - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == stack.length -1;
    }

    @Override
    public void push(T object) {
        if (this.isFull()) {
            this.stack = resizeStack();
        }
        top++;
        stack[top] = object;
    }

    @Override
    public T pop() {
        if (this.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        } else {
            T element = stack[top];
            stack[top] = null;
            top--;
            return element;
        }
    }

    @Override
    public T peek() {
        if (this.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        } else {
            return stack[top];
        }
    }

    public T[] resizeStack() {
        return Arrays.copyOf(stack, stack.length * 2);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ArrayStack{");
        sb.append("Stack content=").append(stack == null ? "null" : Arrays.asList(stack).toString());
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) {

        ArrayStack stack = new ArrayStack();
        System.out.println(stack.toString());

        try {
            System.out.println(stack.peek());
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        stack.push("first element");
        stack.push(2.0);
        stack.push(3);
        stack.push("fourth element");
        stack.push(5);
        stack.push(6);

        System.out.println(stack.toString());

        try {
            System.out.println(stack.peek());
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(stack.toString());

        try {
            System.out.println(stack.pop());
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(stack.toString());

        stack.push("next object");

        System.out.println(stack.toString());

    }

}
