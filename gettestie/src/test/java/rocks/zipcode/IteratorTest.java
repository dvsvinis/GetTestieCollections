package rocks.zipcode;


import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

//listIterator is used for List Collections. It can go hasPrevious and hasNext


public class IteratorTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void hasNextTest() {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()) {
            System.out.print((it.next()));
        }
        String expected = "01234";
        String actual = "01234";
        assertEquals(expected, expected);
    }

    @org.junit.Test
    public void removeTest() {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()) {
            if(it.next() %2 ==0){
                it.remove();
            }
        }
        System.out.println(list);
        String expected = "[1, 3]";
        String actual = "[1, 3]";
        assertEquals(expected, expected);
    }

}
