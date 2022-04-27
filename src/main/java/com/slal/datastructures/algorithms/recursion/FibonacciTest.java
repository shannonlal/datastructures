package com.slal.datastructures.algorithms.recursion;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {
    Fibonacci fibonacci;
    @Before
    public void setUp() throws Exception {
        fibonacci = new Fibonacci();
    }

    @Test
    public void testOne(){
        int result = fibonacci.fibonacci(1);

        assertEquals(1,result );
    }

    @Test
    public void testTwo(){
        int result = fibonacci.fibonacci(2);

        assertEquals(1,result );
    }

    @Test
    public void testN5(){
        int result = fibonacci.fibonacci(5);

        assertEquals(5,result );
    }


}
