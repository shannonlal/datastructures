package com.slal.datastructures.sorting;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class InsertionSortTest {
    private InsertionSort sorter;

    @Before
    public void setUp() throws Exception {
        sorter = new InsertionSort();
    }

    @Test
    public void testSortedList() {
        int simpleArray[] ={0,1,2,3,4,5};

        int[] rst = sorter.sort(simpleArray);

        assertEquals( simpleArray, rst);
        //assertEquals( "Regular multiplication should work", calculator.multiply(4,5), 20);
    }

    @Test
    public void testReverseSortedList() {
        int simpleArray[] ={5,4,3,2,1,0};
        int expectedSort[] = {0,1,2,3,4,5};

        int[] rst = sorter.sort(simpleArray);

        assertEquals( simpleArray, rst);
        //assertEquals( "Regular multiplication should work", calculator.multiply(4,5), 20);
    }

}
