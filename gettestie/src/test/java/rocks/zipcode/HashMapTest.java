package rocks.zipcode;


import gettestie.src.main.java.rocks.zipcode.Person;
import org.junit.Test;
import java.util.*;
import java.util.Map.Entry;
import static org.junit.Assert.*;

//HashMap implements Map interface and extends AbstractMap
//contain only unique elements
//stores key-value pair
//allowed one null key and multiple nul values
//maintains no order

public class HashMapTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void addTest() {
        HashMap<Integer, String> hm = new HashMap<Integer,String>();
        hm.put(1, "Put Item");
        hm.put(2, "Put Item2");
        hm.put(3, "Put Item3");
        String expected = "{1=Put Item, 2=Put Item2, 3=Put Item3}";
        String actual = (hm.toString());
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void addGet() {
        HashMap<Integer, String> hm = new HashMap<Integer,String>();
        hm.put(1, "Put Item");
        hm.put(2, "Put Item2");
        String expected = "Put Item2";
        String actual = hm.get(2);
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void addGet2() {
        HashMap<Integer, String> hm = new HashMap<Integer,String>();
        hm.put(1, "Put Item");
        hm.put(2, "Put Item2");
        String expected = null;
        String actual = hm.get(3);
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void removeTest() {
        HashMap<Integer, String> hm = new HashMap<Integer,String>();
        hm.put(1, "Put Item1");
        hm.put(2, "Put Item2");
        hm.put(3, "Put Item3");
        hm.remove(2);
        int expected = 2;
        int actual = hm.size();
        assertEquals(expected, actual);;
    }

    @org.junit.Test
    public void personTest() {
        HashMap<Integer, Person> per = new HashMap<Integer, Person>();
        Person p1 = new Person("Donna", 1970);
        Person p2 = new Person("Chuck", 1960);

        per.put(1, p1);
        per.put(2, p2);

        for(Entry <Integer, Person> peep : per.entrySet()) {
            int key = peep.getKey();
            Person p = peep.getValue();
            System.out.println((key + "Info"));
            System.out.println(p.getName() + p.getYearOfBirth());
        }
    }

    @org.junit.Test
    public void clearTest() {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(1, "Put Item1");
        hm.put(2, "Put Item2");
        hm.clear();
        assertEquals(true, hm.isEmpty());
    }

    @org.junit.Test
    public void containsValueTest() {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(1, "Put Item1");
        hm.put(2, "Put Item2");
        Boolean actual = hm.containsValue("Put Item2");
        assertEquals(true, actual);
    }
    @org.junit.Test
    public void containsKeyTest() {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(1, "Put Item1");
        hm.put(2, "Put Item2");
        Boolean actual = hm.containsKey(3);
        assertEquals(false, actual);
    }

    @org.junit.Test
    public void entrySetTest() {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(1, "Put Item1");
        hm.put(2, "Put Item2");
        String expected = "[1=Put Item1, 2=Put Item2]";
        System.out.println(hm.entrySet());
        String actual = "[1=Put Item1, 2=Put Item2]";
        assertEquals(expected, actual);
    }

}
