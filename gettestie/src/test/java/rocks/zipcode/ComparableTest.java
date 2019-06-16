package rocks.zipcode;


import gettestie.src.main.java.rocks.zipcode.Person;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;


public class ComparableTest{

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void sortTest() {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("cow");
        strings.add("horse");
        strings.add("goat");
        Collections.sort(strings);   // sort the list
        System.out.println(strings);
        String expected = "[cow, goat, horse]";
        String actual = "[cow, goat, horse]";
        assertEquals(expected, actual);
        Collections.sort(strings);
        System.out.println(strings);
    }

    @org.junit.Test
    public void compareToTest() {
        String string1 = "Harry";
        String string2 = "Henry";
        System.out.println(string1.compareTo(string2));
        if(string1.compareTo(string2) < 0){
            System.out.println("string1 comes first");
        }
        else if(string1.compareTo(string2) > 0){
            System.out.println("string2 comes first");
        } else {
            System.out.println("strings are equal");
        }
        int expected = -4;
        assertEquals(expected, string1.compareTo(string2));
    }



}
