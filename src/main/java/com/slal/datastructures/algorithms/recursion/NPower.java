package com.slal.datastructures.algorithms.recursion;

/**
 * The following will provide the nth power.  Note: Lost notes in crash
 */
public class NPower {

    public int power( int base, int n){
        if( n == 1) return base;

        return power( base, n-1);
    }
}
