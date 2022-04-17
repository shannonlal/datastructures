package com.slal.datastructures.sorting;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class BubbleSortTest {
    private BubbleSort sorter;

    @Before
    public void setUp() throws Exception {
        sorter = new BubbleSort();
    }

    @Test
    public void testSortedList() {
        int simpleArray[] ={0,1,2,3,4,5};

        int[] rst = sorter.sort(simpleArray);

        assertEquals( simpleArray, rst);
    }

    @Test
    public void testSortedReverseList() {
        int simpleArray[] ={5,4,3,2,1,0};
        int expectedArray[] ={0,1,2,3,4,5};

        int[] rst = sorter.sort(simpleArray);

        assertArrayEquals( expectedArray, rst);
    }

    @Test
    public void testSortedMixedList() {
        int simpleArray[] ={2,1,5,3,4,0};
        int expectedArray[] ={0,1,2,3,4,5};

        int[] rst = sorter.sort(simpleArray);

        assertArrayEquals( expectedArray, rst);
    }

    @Test
    public void testSortedSingleList() {
        int simpleArray[] ={0};
        int expectedArray[] ={0};

        int[] rst = sorter.sort(simpleArray);

        assertArrayEquals( expectedArray, rst);
    }
}
