package com.slal.datastructures.sorting;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SelectionSortTest {
    private SelectionSort sorter;

    @Before
    public void setUp() throws Exception {
        sorter = new SelectionSort();
    }

    @Test
    public void testSortedList() {
        int simpleArray[] ={0,1,2,3,4,5};

        int[] rst = sorter.sort(simpleArray);

        assertEquals( simpleArray, rst);
    }

    @Test
    public void testReverseSortedList() {
        int simpleArray[] ={5,4,3,2,1,0};
        int expectedSort[] = {0,1,2,3,4,5};

        int[] rst = sorter.sort(simpleArray);

        assertEquals( simpleArray, rst);
    }
}
