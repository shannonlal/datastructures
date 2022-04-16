package com.slal.datastructures.sorting;
import java.util.logging.Logger;
import java.util.logging.Level;

/**
 * The following class will implement the insertion sort class
 *
 */
public class InsertionSort implements Sortable{
    private static final Logger LOGGER = Logger.getLogger( InsertionSort.class.getName() );
    @Override
    public int[] sort(int[] arr) {
        LOGGER.log( Level.INFO, "Start of insertion sort");

        //Start at the second element and work your down the array.  Compare each element to every
        //Element in the list
        for( int i=1; i < arr.length; i++){
            int j = i-1;

            // Compare key (element at i) to every other element to the left
            while( j > 0 && arr[j] > arr[i]){
                arr[j + 1] = arr[j];
                j = j -1;
            }
        }
        return arr;
    }
}
