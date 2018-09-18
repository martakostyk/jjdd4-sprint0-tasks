package martak.jjdd4sprint0.task2;

public enum MathOperation {

    SUM(1),
    SUBTRACT(2),
    MULTIPLY(3),
    DIVIDE(4);

    private int value;

    MathOperation(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
