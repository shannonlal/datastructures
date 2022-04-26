package com.slal.datastructures.algorithms.recursion;

/**
 * The following is a recursive algorithm for printing a series of numbers
 *
 * The order of doing this using recussion.  A recurssion algorithm needs two conditions
 *
 * If at end.  Do something
 *
 * If not at end do something.
 *
 * In this example:
 * i) When we reach the end of the list we will print
 * ii) Otherwise we will recrusively call the end of the list
 *
 */
public class PrintNumbers {

    public void printReverse( int[] list, int currentIndex ){

        if( currentIndex != (list.length) ){
            printReverse(list, currentIndex+1);
            System.out.println( list[currentIndex ]);
            return;
        }
        return;
    }

    public void printInorder( int[] list, int currentIndex ){

        if( currentIndex != (list.length) ){
            System.out.println( list[currentIndex ]);
            printInorder(list, currentIndex+1);
            return;
        }
        return;
    }

    public static void main(String[] args){

        PrintNumbers tmp = new PrintNumbers();
        int[] l = {1,4,2,5,6,8,1,1};

        tmp.printReverse(l,0);
        tmp.printInorder(l, 0);
    }

}
