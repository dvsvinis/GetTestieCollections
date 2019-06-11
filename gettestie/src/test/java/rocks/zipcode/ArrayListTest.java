package rocks.zipcode;

import static org.junit.Assert.*;

import java.util.*;

public class ArrayListTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestAdd() {
        ArrayList<Integer> listA = new ArrayList<Integer>();
        listA.add(1);
        listA.add(2);
        listA.add(3);
        System.out.println(listA);
        int expected = 3;
        assertEquals(expected, listA.size());
    }

    @org.junit.Test
    public void TestInsert() {
        ArrayList<Integer> listA = new ArrayList<Integer>();
        listA.add(1);
        listA.add(2);
        listA.add(3);
        listA.add(2, 6);
        assertEquals(listA.size(), 4);
        Integer expected = 6;
        assertEquals(expected, listA.get(2));
        System.out.println(listA);

    }

    @org.junit.Test
    public void testRemove() {
        ArrayList<Integer> listA = new ArrayList<Integer>();
        listA.add(1);
        listA.add(2);
        listA.add(3);
        assertEquals(listA.size(), 3);
        listA.remove(1);
        assertEquals(listA.size(), 2);
    }

    @org.junit.Test
    public void testGet() {
        ArrayList<Integer> listA = new ArrayList<Integer>();
        listA.add(1);
        listA.add(2);
        listA.add(3);
        Integer expected = 2;
        assertEquals(expected, listA.get(1));
    }

    @org.junit.Test
    public void testClear() {
        ArrayList<Integer> listA = new ArrayList<Integer>();
        listA.add(1);
        listA.add(2);
        listA.add(3);
        listA.clear();
        assertEquals(true, listA.isEmpty());
    }

    @org.junit.Test
    public void testIndexOf() {
        ArrayList<Integer> listA = new ArrayList<Integer>();
        listA.add(1);
        listA.add(2);
        listA.add(3);
        listA.indexOf("3");
        int expected = 2;
        assertEquals(expected, listA.indexOf(3));
    }

    @org.junit.Test
    public void testContains() {
        ArrayList<Integer> listA = new ArrayList<Integer>();
        listA.add(1);
        listA.add(2);
        listA.add(3);
        assertEquals(false, listA.contains(5));
    }

    @org.junit.Test
    public void testSort() {
        ArrayList<Integer> listA = new ArrayList<Integer>();
        listA.add(4);
        listA.add(2);
        listA.add(6);
        Collections.sort(listA);
        System.out.println(listA.toString());
    }

    @org.junit.Test
    public void testSortReverse() {
        ArrayList<Integer> listA = new ArrayList<Integer>();
        listA.add(4);
        listA.add(2);
        listA.add(6);
        Comparator c = Collections.reverseOrder();
        Collections.sort(listA, c);
        System.out.println(listA.toString());
    }
}
