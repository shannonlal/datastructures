# Quick Sort

The following is the is the the psuedo code for Quick Sort

## Questions:
1. What is the normal distrubtion of the shuffle for?

Notes:
1. This is a divide and conquor process and as such it needs a pivot point
Note: Where to take pivot.  Most algorihtms will take the 
first element as its pivot point; however, quick sort will
normally do a quick shuffle.  this shuffle will normally
distribute the data and envures that

2. This splits the data around the pivot and sorts it on either side
3. By the time it has gotten to the end the array is split

## Example:

Input: 3,5,1,8,7,2,9,6

### Iteration 1:
piv_index: 0
piv_value: 3

new_arr[] = 1,2,4
new_arr[] = 5,6,7,8,9

### Iteration 2a:
Input: 1,2,4
piv_index: 1, piv_value
new_arr[] = 1
new_arr[] = 2,4

### Iteration 2b:
InputL 5,6,7,8,9
piv_index: 0
new_arr = []
new_arr = [6,7,8,9]

### Iteration 3a:
input 1

## Interation 3b:
piv_index: 0, 2
new_arr = [2]



### Code

### Base case

If( length of 1) = stop

If ( length of array is <= 2)
-- Find pivot 
-- Find all elements to left of pivot
-- Find all elements to the right of pivot

-- Copy all remaining elements to list
-- Copy elements into to original

-- sortMerge( arr, start, (start+end)/2)
-- sortMerge( arr, (start+end)/2+1, end)

public void quickSort( int[] arr, int start, int end){    
    if( start < end){
        int pivot = arr[start];
        
        int pivot_index = split( arr, start, pivot, end);
        
        quickSort( arr, start, pivot_index-1);
        quickSort( arr, pivot_index+1, end);
    }
}

public void split( int[] arr, int start, int end){

}