package rocks.zipcode;

import org.junit.Test;

import java.util.HashSet;
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
    public void TestStack1() {
        Set<String> hashsetContains = new HashSet<>();
        hashsetContains.add("String Added");
        assertTrue(hashsetContains.contains("String Added"));
    }

}
