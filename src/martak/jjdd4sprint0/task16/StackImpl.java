package martak.jjdd4sprint0.task16;

import java.util.ArrayList;
import java.util.List;

public class StackImpl<T> implements Stack<T> {

    private List<T> stack;
    private int topIndex;

    public StackImpl() {
        this.stack = new ArrayList<>();
        this.topIndex = -1;
    }

    public List<T> getStack() {
        return stack;
    }

    public int getTopIndex() {
        return topIndex;
    }

    @Override
    public void push(T o) {
        stack.add(o);
        topIndex += 1;
    }

    @Override
    public T pop() {
        if (topIndex < 0) {
            throw new IllegalStateException("Stack is empty");

        } else {
            T element = stack.get(topIndex);
            stack.remove(topIndex);
            topIndex = stack.size() - 1;
            return element;
        }
    }

    @Override
    public T peek() {
        if (topIndex < 0) {
            throw new IllegalStateException("Stack is empty");

        } else {
            return stack.get(topIndex);
        }
    }
}
