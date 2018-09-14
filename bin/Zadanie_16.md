1. Zaimplementuj stos (ang. stack), w którym mogą być przechowywane dowolne obiekty.

2. Implementacja stosu powinna być zgodna z interfejsem Stack (Stack.java).

3. Użyj generyków.

4. Jeśli stos jest pusy, metody peek() i pop() powinny zwracać IllegalStateException.

```java
public interface Stack<T> {

    void push(T o);

    T pop();

    T peek();
}

```
