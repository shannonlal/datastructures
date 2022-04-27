package com.slal.datastructures.algorithms.recursion;

import com.slal.datastructures.algorithms.connectivity.QuickFindConnectivity;
import com.slal.datastructures.algorithms.connectivity.UniquePair;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class ReverseStringTest {
    private ReverseString reverse;
    @Before
    public void setUp() throws Exception {
        reverse = new ReverseString();
    }

    @Test
    public void testReserseSimple(){
        String str = "Hello";

        String reversed = reverse.reverseString(str);

        assertNotNull(reversed);
        assertEquals("olleH",reversed );
    }

    @Test
    public void testEmptySimple(){
        String str = null;

        String reversed = reverse.reverseString(str);

        assertNull(reversed);
        //assertEquals("olleH",reversed );
    }

    @Test
    public void testSingleSimple(){
        String str = "a";

        String reversed = reverse.reverseString(str);

        assertNotNull(reversed);
        assertEquals("a",reversed );
    }

    @Test
    public void testDoubleSimple(){
        String str = "ab";

        String reversed = reverse.reverseString(str);

        assertNotNull(reversed);
        assertEquals("ba",reversed );
    }
}
