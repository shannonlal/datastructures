package com.slal.datastructures.algorithms;

import com.slal.datastructures.sorting.BubbleSort;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertNotNull;


public class StableMatchingTest {
    private StableMatching algorithm;

    @Before
    public void setUp() throws Exception {
        algorithm = new StableMatching();
    }

    @Test
    public void testBasicScenarios() {
        int studentPref[][] = {
                {0, 2, 1, 3}, //s0
                {0, 3, 1, 2}, //s1
                {1, 2, 3, 0}, //s2
                {1, 0, 3, 2}
        };

        // Preference order for 4 medschools
        int medSchoolsPref[][] = {
                {1, 0, 2, 3},
                {1, 2, 3, 0},
                {0, 1, 3, 2},
                {0, 1, 3, 2}
        };


        Map<Integer, Integer> matches = algorithm.findStableMatches(studentPref,medSchoolsPref );

        System.out.println( "Value"+matches);

        assertNotNull( matches);
    }


}
