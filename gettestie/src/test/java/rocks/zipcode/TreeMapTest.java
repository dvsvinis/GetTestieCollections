package rocks.zipcode;

import java.util.*;
import java.util.Map.Entry;
import static org.junit.Assert.*;
import java.util.TreeMap;


// uses a sorting criteria, sorted by keys
//extends sorted map, navigable map
//has all the methods that hashmap has, but sorted

public class TreeMapTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void addTest() {
        TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();
        treeMap.put("Wile", 10);
        treeMap.put("Suka", 20);
        String expected = "{Suka=20, Wile=10}";  //sorted order
        String actual = "{Suka=20, Wile=10}";
        System.out.println(treeMap);
        assertEquals(expected, actual);
    }

    //highest key lower than 25
    @org.junit.Test
    public void highestLowerTest() {
        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
        treeMap.put(4, "Wile");
        treeMap.put(10, "Suka");
        treeMap.put(25, "Dave");
        treeMap.put(50, "Chuck");
        treeMap.put(5, "Annie");
        Integer expected = 10;
        assertEquals(expected, treeMap.lowerKey(25));
        System.out.println((treeMap.lowerKey(25)));
    }

    //highest key lower than or equal to 25
    @org.junit.Test
    public void highestTest() {
        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
        treeMap.put(4, "Wile");
        treeMap.put(10, "Suka");
        treeMap.put(25, "Dave");
        treeMap.put(50, "Chuck");
        treeMap.put(5, "Annie");
        Integer expected = 25;
        assertEquals(expected, treeMap.floorKey(25));
        System.out.println((treeMap.floorKey(25)));
    }

        //lowest key higher than 25
        @org.junit.Test
        public void lowestTest() {
            TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
            treeMap.put(4, "Wile");
            treeMap.put(10, "Suka");
            treeMap.put(25, "Dave");
            treeMap.put(50, "Chuck");
            treeMap.put(5, "Annie");
            Integer expected = 50;
            assertEquals(expected, treeMap.higherKey(25));
            System.out.println((treeMap.higherKey(25)));
        }

    //ceiling key higher than or equal to 25
    @org.junit.Test
    public void ceilingTest() {
        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
        treeMap.put(4, "Wile");
        treeMap.put(10, "Suka");
        treeMap.put(25, "Dave");
        treeMap.put(50, "Chuck");
        treeMap.put(5, "Annie");
        Integer expected = 25;
        assertEquals(expected, treeMap.ceilingKey(25));
        System.out.println((treeMap.ceilingKey(25)));
    }

    //returns map in reverse order
    @org.junit.Test
    public void descendingTest() {
        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
        treeMap.put(4, "Wile");
        treeMap.put(10, "Suka");
        treeMap.put(25, "Dave");
        treeMap.put(50, "Chuck");
        treeMap.put(5, "Annie");
        String expected = "{50=Chuck, 25=Dave, 10=Suka, 5=Annie, 4=Wile}";
        String actual = "{50=Chuck, 25=Dave, 10=Suka, 5=Annie, 4=Wile}";
        assertEquals(expected, actual);
        System.out.println(treeMap);
        System.out.println(treeMap.descendingMap());
    }

    //returns and removes 1st entry
    //can also do pollLastEntry
    @org.junit.Test
    public void pollFirstEntryTest() {
        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
        treeMap.put(4, "Wile");
        treeMap.put(10, "Suka");
        treeMap.put(25, "Dave");
        treeMap.put(50, "Chuck");
        treeMap.put(5, "Annie");
        String expected = "4=Wile";
        String actual = "4=Wile";
        assertEquals(expected, actual);
        System.out.println(treeMap.pollFirstEntry());
        System.out.println(treeMap); //WilE removed from list
    }


}

