package martak.jjdd4sprint0.task15;

public interface Queue<T> {

    void enqueue (T e);

    T dequeue();

    int size();
}
