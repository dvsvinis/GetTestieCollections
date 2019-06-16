package rocks.zipcode;
import static org.junit.Assert.*;

import java.util.*;
import java.util.LinkedList;

//inherits AbstractCollection class, implements Deque interface
//has no capacity restrictions
//null elements are not allowed
//faster than a stack, faster than a linkedList, can be used as both
//iterator allows removal and modification of elements


public class ArrayDequeTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void offerFirstTest() {
        ArrayDeque<String> arrayA = new ArrayDeque<String>();
        arrayA.add("A");
        arrayA.add("B");
        arrayA.add("C");
        System.out.println(arrayA);
        arrayA.offerFirst("D");
        System.out.println(arrayA);
        String expected = "[D, A, B, C]";
        String actual = "[D, A, B, C]";
        assertEquals(expected, actual);
    }

    //poll removes the first element
    @org.junit.Test
    public void pollTest() {
        ArrayDeque<String> arrayA = new ArrayDeque<String>();
        arrayA.add("A");
        arrayA.add("B");
        arrayA.add("C");
        System.out.println(arrayA);
        String s = arrayA.poll();
        System.out.println(s);
        String expected = "A";
        assertEquals(expected, s);
    }

    @org.junit.Test
    public void pushTest() {
        ArrayDeque<String> arrayA = new ArrayDeque<String>();
        arrayA.add("A");
        arrayA.add("B");
        arrayA.push("C");
        String expected = "[A, B, C]";
        String actual = "[A, B, C]";
        assertEquals(expected, actual);
        arrayA.push("C");
    }

    //most of the same methods as LinkedList

}
