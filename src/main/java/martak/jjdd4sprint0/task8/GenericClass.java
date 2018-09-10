package martak.jjdd4sprint0.task8;

public class GenericClass<T> {
    private T item;

    public GenericClass(T item) {
        this.item = item;
    }

    public void displayItemType() {
        System.out.println(item.getClass());
    }

    public static void main(String[] args) {

        GenericClass<Double> object1 = new GenericClass<>(12.5);
        GenericClass<String> object2 = new GenericClass<>("String");
        GenericClass<Something> object3 = new GenericClass<>(new Something());

        object1.displayItemType();
        object2.displayItemType();
        object3.displayItemType();
    }
}
