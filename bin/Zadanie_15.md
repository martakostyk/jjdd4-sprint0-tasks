1. Zaimplementuj kolejkę (ang. queue), w której mogą być przechowywane dowolne obiekty.

2. Implementacja kolejki powinna być zgodna z interfejsem Queue (Queue.java).

3. Użyj generyków.

```java
public interface Queue<T> {

    void enqueue(T o);

    T dequeue();

    int size();
}
```
