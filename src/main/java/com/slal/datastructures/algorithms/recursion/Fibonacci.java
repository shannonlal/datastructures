package com.slal.datastructures.algorithms.recursion;

/**
 * Since this is a recursive call we need to figure out the stop conditions and the
 * recursive call:
 *
 * Stop condition:
 * f(0) = 0 and/Or f(1) = 1
 *
 *
 * Sequence:
 *
 * 0
 * 1
 * 1
 * 2
 * 3
 * 5
 * 8
 * 13
 *
 * Find the nth element of the sequence:
 *
 * Input: n = 5
 *
 * Output: 3
 *
 * Input: n = 8
 * Output: 13
 *
 *
 * Sequence:
 *
 * Start at 0 and go to n
 *
 * given: n = 0, output is 0 -- Stop condition
 * given: n = 1, output is 1 -- stop condition
 * given: n = 2, output is previous and previous
 * given: n = 3, output is previous and previous
 */
public class Fibonacci {

    public int fibonacci( int n){
        if( n <= 1) return n;

        return fibonacci(n-1) + fibonacci(n-2);
    }
}
