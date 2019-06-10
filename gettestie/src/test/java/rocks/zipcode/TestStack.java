package rocks.zipcode;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStackisEmpty() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    // Make a bigger test exercising more Stack methods.....

    @org.junit.Test
    public void TestStackPeek() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        String expected = "Hello world";
        assertEquals(expected, stack.peek());
    }

    @org.junit.Test
    public void TestPop() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        String expected = "Hello world";
        assertEquals(expected, stack.pop());
    }

}
