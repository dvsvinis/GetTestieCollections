package rocks.zipcode;

import static org.junit.Assert.*;

import java.util.*;
import java.util.LinkedList;


//ordered collection
//can add element to front or end list
//implements Queue/Deque interface

public class LinkedListTest {
    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void getFirstTest() {
        LinkedList<Integer> listA = new LinkedList<Integer>();
        listA.add(1);
        listA.add(2);
        listA.addLast(3);
        Integer expected = 1;
        assertEquals(expected, listA.getFirst());
    }

    @org.junit.Test
    public void getLastTest() {
        LinkedList<Integer> listA = new LinkedList<Integer>();
        listA.add(1);
        listA.add(2);
        listA.addLast(3);
        Integer expected = 3;
        assertEquals(expected, listA.getLast());
    }

    @org.junit.Test
    public void removeLastTest() {
        LinkedList<Integer> listA = new LinkedList<Integer>();
        listA.add(1);
        listA.add(2);
        listA.addLast(3);
        Integer expected = 2;
        listA.removeLast();
        assertEquals(expected, listA.getLast());
    }

    @org.junit.Test
    public void removefirstTest() {
        LinkedList<Integer> listA = new LinkedList<Integer>();
        listA.add(1);
        listA.add(2);
        listA.addLast(3);
        Integer expected = 2;
        listA.removeFirst();
        assertEquals(expected, listA.getFirst());
    }

    @org.junit.Test
    public void peekFirstTest() {
        LinkedList<Integer> listA = new LinkedList<Integer>();
        listA.add(1);
        listA.add(2);
        listA.addLast(3);
        Integer expected = 1;
        assertEquals(expected, listA.peekFirst());
    }

    @org.junit.Test
    public void peekLastTest() {
        LinkedList<Integer> listA = new LinkedList<Integer>();
        listA.add(1);
        listA.add(2);
        listA.addLast(3);
        Integer expected = 3;
        assertEquals(expected, listA.peekLast());
    }

    //poll returns and removes element in one command
    @org.junit.Test
    public void pollFirstTest() {
        LinkedList<Integer> listA = new LinkedList<Integer>();
        listA.add(1);
        listA.add(2);
        listA.addLast(3);
        Integer expected = 1;
        assertEquals(expected, listA.pollFirst());
    }

    @org.junit.Test
    public void pollLastTest() {
        LinkedList<Integer> listA = new LinkedList<Integer>();
        listA.add(1);
        listA.add(2);
        listA.addLast(3);
        Integer expected = 3;
        assertEquals(expected, listA.pollLast());
    }


    @org.junit.Test
    public void descendingIteratorTest() {
        LinkedList<Integer> listA = new LinkedList<Integer>();
        listA.add(1);
        listA.add(2);
        listA.addLast(3);
        Iterator<Integer> intLastIterator = listA.descendingIterator();
        while (intLastIterator.hasNext()){
            System.out.println(intLastIterator.next());
        }
    }

    @org.junit.Test
    public void setTest() {
        LinkedList<Integer> listA = new LinkedList<Integer>();
        listA.add(1);
        listA.add(2);
        listA.addLast(3);
        listA.set(2, 100);
        Integer expected = 100;
        assertEquals(expected, listA.get(2));
    }

    @org.junit.Test
    public void removeFirstOccurrenceTest() {
        LinkedList<Integer> listA = new LinkedList<Integer>();
        listA.add(1);
        listA.add(2);
        listA.add(2);
        listA.add(2);
        listA.add(3);
        listA.removeFirstOccurrence(2);
        int expected = 4;
        assertEquals(expected, listA.size());
        System.out.println(listA
        );
    }

    @org.junit.Test
    public void indexOfTest() {
        LinkedList<Integer> listA = new LinkedList<Integer>();
        listA.add(1);
        listA.add(2);
        listA.add(2);
        listA.add(2);
        listA.add(3);
        int expected = 1;
        assertEquals(expected, listA.indexOf(2));
    }

    @org.junit.Test
    public void lastIndexOfTest() {
        LinkedList<Integer> listA = new LinkedList<Integer>();
        listA.add(1);
        listA.add(2);
        listA.add(2);
        listA.add(2);
        listA.add(3);
        int expected = 3;
        assertEquals(expected, listA.lastIndexOf(2));
    }
}
