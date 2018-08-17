package martak.jjdd4sprint0.task15;

import java.util.Arrays;

public class ArrayQueue<T> implements Queue<T> {

    private T[] queue;
    private int front, rear, currentSize;

    private static final int maxQueueSize = 5;

    public ArrayQueue() {
        this.queue = (T[]) new Object[maxQueueSize];
        this.front = -1;
        this.rear = -1;
    }

    private boolean isEmpty() {
        return currentSize == 0;
    }

    private T[] resizeQueue() {
        return Arrays.copyOf(queue, queue.length * 2);
    }

    @Override
    public void enqueue(T element) {
        if (currentSize == queue.length) {
            this.queue = resizeQueue();
        }
        if (isEmpty()) {
            front++;
        }
        rear++;
        queue[rear] = element;
        currentSize++;
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        } else {
            T element = queue[front];
            for (int i = 0; i <= rear; i++) {
                queue[i] = queue[i + 1];
            }
            rear--;
            currentSize--;
            if (currentSize == 0) {
                front--;
            }
            return element;
        }
    }

    @Override
    public int size() {
        return currentSize;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ArrayQueue{");
        sb.append("Queue content=").append(queue == null ? "null" : Arrays.asList(queue).toString());
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) {

        ArrayQueue queue = new ArrayQueue();
        System.out.println(queue.toString());

        try {
            System.out.println(queue.dequeue());
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        queue.enqueue("first element");
        queue.enqueue("first element");

        System.out.println(queue.toString());
        System.out.println("Queue size: " + queue.size());

        try {
            System.out.println(queue.dequeue());
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(queue.toString());
        System.out.println("Queue size: " + queue.size());


        try {
            System.out.println(queue.dequeue());
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Queue size: " + queue.size());

    }
}
