package com.example.us1_2_location_labeling;

import org.junit.Test;

import static org.junit.Assert.*;

import android.content.Intent;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void parseStringTest() {
        String s1 = "Not a coordinate";
        String s2 = "12.82 -05.12";

        String[] s1List = Utilities.parseCoords(s1);
        String[] s2List = Utilities.parseCoords(s2);

        assertEquals("Not", s1List[0]);
        assertEquals("a", s1List[1]);
        assertEquals("coordinate", s1List[2]);

        assertEquals("12.82", s2List[0]);
        assertEquals("-05.12", s2List[1]);
    }

    @Test
    public void checkLatitudeTest() {
        String s1 = "words";
        String s2 = "-15.99";
        String s3 = "89.99";
        String s4 = "0.00";
        String s5 = "208.9498";
        String s6 = "-100.13";


        assertEquals(false, Utilities.isValidLatitude(s1));
        assertEquals(true, Utilities.isValidLatitude(s2));
        assertEquals(true, Utilities.isValidLatitude(s3));
        assertEquals(true, Utilities.isValidLatitude(s4));
        assertEquals(false, Utilities.isValidLatitude(s5));
        assertEquals(false, Utilities.isValidLatitude(s6));
    }

    @Test
    public void checkLongitudeTest() {

    }

}