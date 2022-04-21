package com.slal.datastructures.algorithms.connectivity;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * The input into this is a series of pairs of connected values
 * Output:
 * -- All the non-connected values
 *
 * Example:
 * -- Inputs: [1,2], [2,4], [3,5], [5,6]
 *
 * -- Outputs: [1,5],[1,3], [1,6],[2,5],[2,3],[4,5],[4,3],[4,6]
 *
 * Key algorithm
 *
 * Definition:
 * keys.  This will be each unique pair
 * Sets: this will be represented by every connected pair.  Example above:
 * ** set 1: 1,2,4
 * ** set 3: 3,5,6
 * Storage: Data structure
 * - We will use a Hashmap to store a list of all the keys and their corresponding sets
 *
 * High Level Pseudo Code:
 * 1. For each Input Pair
 * ** i. Check the first item in the pair LOAD into hashmap (see steps below)
 * 2. For each set construct a pair of unique non-connect pairs (i.e find non-connected pair)
 * -- Define a Set<UniquePairs> -- Unique Pairs has equals so that [1,2] === [2,1].  The Set will enforce uniqueness in list
 * For Each set repeat the following:
 * -- Find each set's keys
 * -- For each key construct a pair of
 *
 *
 * Load Hashmap
 * Conditions:
 * 1. Both Keys (A and B) already exist and have same Set:  Do nothing
 * 2. Both Keys (A and B) already exist and but have different sets:
 *** -- Need to update sets.  Pick first key's set(i.e. A) and get second key's set (i.e. B).  We need to update all of the keys using B to use A
 * 3. 1 Key (A) is in map but other does not(i.e. B).  Add key and set its set to for A
 *
 *
 */
public class QuickFindConnectivity {

    private Map<Integer, Integer> pairs;

    public QuickFindConnectivity(){
        pairs = new HashMap<>();
    }

    public void loadPairs(List<UniquePair> p){
        if( p == null ) return;

        Iterator<UniquePair> itr = p.iterator();
        while( itr.hasNext()){
            // Get Keys
            UniquePair pair = itr.next();
            Integer a = pairs.get( pair.getA() );
            Integer b = pairs.get( pair.getB() );

            if( a == null && b == null ){
                //First case.  Setting set to a
                pairs.put( pair.getA(),pair.getA());
                pairs.put( pair.getB(),pair.getA());
            } else if( a == null && b != null){
                // Second case. Setting key b to set a
                pairs.put(pair.getA(), b);
            } else if( a != null && b == null ){
                // Second case. Setting key a to set b
                pairs.put(pair.getB(),a);
            } else {
                //need to swap them
                swapSets(a,b);
            }
        }
    }

    /**
     * This function will get the set of pair A and find all the pairs that correspond to the
     * set of Pair B and swap them to set A
     * @param pairA
     * @param pairB
     */
    private void swapSets( Integer pairA, Integer pairB){
        Integer setA = this.pairs.get( pairA );
        Integer setB = this.pairs.get( pairB );

        this.pairs.entrySet().stream().filter(entry -> entry.getValue() == setB).forEach((k) -> {
            System.out.println("Key"+k.getKey()+" Val"+ k.getValue());
            k.setValue(( setA));
        });

        //System.out.println(s.count());
        //s.

                //.filter(entry -> entry.getValue() == pairB).forEach( entry -> entry.setValue( pairA));

    }

    public Map<Integer, Integer> getPairs() {
        return pairs;
    }

    public void setPairs(Map<Integer, Integer> pairs) {
        this.pairs = pairs;
    }
}
