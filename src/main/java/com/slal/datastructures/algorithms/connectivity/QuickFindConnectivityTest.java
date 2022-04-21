package com.slal.datastructures.algorithms.connectivity;

import com.slal.datastructures.algorithms.StableMatching;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class QuickFindConnectivityTest {
    private QuickFindConnectivity connectivity;
    @Before
    public void setUp() throws Exception {
        connectivity = new QuickFindConnectivity();
    }

    @Test
    public void testLoadSinglePair(){
        List<UniquePair> pairs = new ArrayList<UniquePair>();

        pairs.add( new UniquePair(1,3));

        connectivity.loadPairs( pairs);

        Map<Integer,Integer> pairMap = connectivity.getPairs();
        assertEquals( pairMap.size(), 2);
        assertEquals((Integer)pairMap.get(1), (Integer)1);
        assertEquals((Integer)pairMap.get(3), (Integer)1);
    }

    @Test
    public void testLoadTwoNonConnectedPairs(){
        List<UniquePair> pairs = new ArrayList<UniquePair>();

        pairs.add( new UniquePair(1,3));
        pairs.add( new UniquePair(2,4));

        connectivity.loadPairs( pairs);

        Map<Integer,Integer> pairMap = connectivity.getPairs();
        assertEquals( pairMap.size(), 4);
        assertEquals((Integer)pairMap.get(1), (Integer)1);
        assertEquals((Integer)pairMap.get(3), (Integer)1);
        assertEquals((Integer)pairMap.get(2), (Integer)2);
        assertEquals((Integer)pairMap.get(4), (Integer)2);
    }

    @Test
    public void testLoadAdditionalNonConnectedPairs(){
        List<UniquePair> pairs = new ArrayList<UniquePair>();
        List<UniquePair> pairs2 = new ArrayList<UniquePair>();
        pairs.add( new UniquePair(1,3));
        pairs2.add( new UniquePair(2,4));

        connectivity.loadPairs( pairs);
        connectivity.loadPairs( pairs2);

        Map<Integer,Integer> pairMap = connectivity.getPairs();
        assertEquals( pairMap.size(), 4);
        assertEquals((Integer)pairMap.get(1), (Integer)1);
        assertEquals((Integer)pairMap.get(3), (Integer)1);
        assertEquals((Integer)pairMap.get(2), (Integer)2);
        assertEquals((Integer)pairMap.get(4), (Integer)2);
    }

    @Test
    public void testTwoConnectedPairs(){
        List<UniquePair> pairs = new ArrayList<UniquePair>();
        List<UniquePair> pairs2 = new ArrayList<UniquePair>();
        pairs.add( new UniquePair(1,3));
        pairs.add( new UniquePair(1,4));

        connectivity.loadPairs( pairs);

        Map<Integer,Integer> pairMap = connectivity.getPairs();
        assertEquals( pairMap.size(), 3);
        assertEquals((Integer)pairMap.get(1), (Integer)1);
        assertEquals((Integer)pairMap.get(3), (Integer)1);
        assertEquals((Integer)pairMap.get(4), (Integer)1);
    }

    @Test
    public void testTwoAlternateConnectedPairs(){
        List<UniquePair> pairs = new ArrayList<UniquePair>();
        pairs.add( new UniquePair(1,3));
        pairs.add( new UniquePair(3,4));

        connectivity.loadPairs( pairs);

        Map<Integer,Integer> pairMap = connectivity.getPairs();
        assertEquals( pairMap.size(), 3);
        assertEquals((Integer)pairMap.get(1), (Integer)1);
        assertEquals((Integer)pairMap.get(3), (Integer)1);
        assertEquals((Integer)pairMap.get(4), (Integer)1);
    }

    @Test
    public void testThreeWithSwapPairs(){
        List<UniquePair> pairs = new ArrayList<UniquePair>();
        pairs.add( new UniquePair(1,3));
        pairs.add( new UniquePair(2,4));
        pairs.add( new UniquePair(2,3));

        connectivity.loadPairs( pairs);

        Map<Integer,Integer> pairMap = connectivity.getPairs();
        assertEquals( pairMap.size(), 4);
        assertEquals((Integer)pairMap.get(1), (Integer)2);
        assertEquals((Integer)pairMap.get(3), (Integer)2);
        assertEquals((Integer)pairMap.get(2), (Integer)2);
        assertEquals((Integer)pairMap.get(4), (Integer)2);
    }
}
