package com.slal.datastructures.algorithms.recursion;

import com.slal.datastructures.algorithms.connectivity.QuickFindConnectivity;
import com.slal.datastructures.algorithms.connectivity.UniquePair;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class NPowerTest {
    private NPower power;
    @Before
    public void setUp() throws Exception {
        power = new NPower();
    }

    @Test
    public void testSinglePower(){
        int result = power.power(3,1);

        assertEquals(3,result );
    }

    @Test
    public void testSquredPower(){
        int result = power.power(3,2);

        assertEquals(9,result );
    }

    @Test
    public void testCubedPower(){
        int result = power.power(5,3);

        assertEquals(125,result );
    }

    @Test
    public void testOneBase(){
        int result = power.power(1,100);

        assertEquals(1,result );
    }

}
