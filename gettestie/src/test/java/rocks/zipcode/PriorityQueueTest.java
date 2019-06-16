package rocks.zipcode;
import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Stack;

//has add remove and poll methods
//implements comparable


public class PriorityQueueTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }


    @org.junit.Test
    public void sizeTest() {
        PriorityQueue<String> student = new PriorityQueue<>();
        student.add("Donna");
        student.add("Chuck");
        student.add("Henry");
        System.out.println("Size of queue " + student.size());
        int expected = 3;
        assertEquals(expected, student.size()); // false
    }

    // orders its elements according to their natural ordering.
    @org.junit.Test
    public void pollTest() {
        PriorityQueue<String> student = new PriorityQueue<>();
        student.add("Donna");
        student.add("Chuck");
        student.add("Henry");

        Iterator<String> it = student.iterator();
        while(it.hasNext()){
            System.out.println(("The item of the queue: " + student.poll().toString()));
        }
        String expected = "The item of the queue: Chuck\n" +
            "The item of the queue: Donna\n" +
            "The item of the queue: Henry";
        String actual = "The item of the queue: Chuck\n" +
            "The item of the queue: Donna\n" +
            "The item of the queue: Henry";
        assertEquals(expected, actual);
    }

}



