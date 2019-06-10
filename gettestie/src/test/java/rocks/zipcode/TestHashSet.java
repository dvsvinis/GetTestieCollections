package rocks.zipcode;

import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import static org.junit.Assert.*;


public class TestHashSet {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestContains() {
        Set<String> hashsetContains = new HashSet<>();
        hashsetContains.add("String Added");
        assertTrue(hashsetContains.contains("String Added"));
    }

    @org.junit.Test
    public void TestRemove() {
        Set<String> hashsetContains = new HashSet<>();
        hashsetContains.add("TestRemove");
        assertTrue(hashsetContains.remove("TestRemove"));  //true if set contains actual
    }

    @org.junit.Test
    public void TestClear() {
        Set<String> hashsetContains = new HashSet<>();
        hashsetContains.add("Something added");
        hashsetContains.clear();
        assertTrue(hashsetContains.isEmpty());  //true if set cleared
    }

    @org.junit.Test
    public void TestSize() {
        Set<String> hashsetContains = new HashSet<>();
        hashsetContains.add("Something added");
        hashsetContains.add("Something added2");
        hashsetContains.add("Something added3");
        assertEquals(3, hashsetContains.size());
    }

    @org.junit.Test
    public void TestIterator() {
        Set<String> hashset = new HashSet<>();
        hashset.add("First");
        hashset.add("Second");
        hashset.add("Third");
        Iterator<String> itr = hashset.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

}
