package martak.jjdd4sprint0.task15;

public interface Queue<T> {

    void enqueue (T element);

    T dequeue();

    int size();
}
