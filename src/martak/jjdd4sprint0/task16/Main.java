package martak.jjdd4sprint0.task16;

public class Main {

    public static void main(String[] args) {
        StackImpl stack = new StackImpl();

        try {
            System.out.println(stack.pop().toString());
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        stack.push("first element");
        stack.push(2);
        stack.push("third");
        stack.push(4.0);

        displayStackContent(stack);

        try {
            System.out.println(stack.pop().toString());
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(stack.peek().toString());

        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        displayStackContent(stack);
    }

    public static void displayStackContent(StackImpl stack) {
        System.out.println("\nStack content");
        for (int i = stack.getStack().size() - 1 ; i >= 0 ; i--) {
            System.out.println(stack.pop().toString());
        }
        System.out.println("\n");
    }
}
