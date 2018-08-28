package martak.jjdd4sprint0.task16;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayStackTest {

    @Test
    public void shouldPushAndPopItems() {
        Stack<String> stack = new ArrayStack<>();

        stack.push("AAA");
        stack.push("BBB");
        stack.push("CCC");
        assertEquals("CCC", stack.peek());
        assertEquals("CCC", stack.peek());

        assertEquals("CCC", stack.pop());
        assertEquals("BBB", stack.peek());

        assertEquals("BBB", stack.pop());
        assertEquals("AAA", stack.peek());

        stack.push("XXX");
        assertEquals("XXX", stack.peek());
        assertEquals("XXX", stack.pop());
        assertEquals("AAA", stack.peek());
        assertEquals("AAA", stack.pop());

        try {
            stack.peek();
            fail("Should throw an exception");
        } catch (Exception e) {
            assertTrue(e instanceof IllegalStateException);
        }

        try {
            stack.pop();
            fail("Should throw an exception");
        } catch (Exception e) {
            assertTrue(e instanceof IllegalStateException);
        }
    }}