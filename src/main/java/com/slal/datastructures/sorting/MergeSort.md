## Merge Sort Top Down approach

1. Check the size of the list.  If bigger than 1 find a pivot
2. Split the list into smaller sub list
3. Merge the list


# Example to work through
Input: 1,4,3,7,9,0,2,5

callMerge Sort
Step 1.  Size is 8 bigger than one
Step 2. What is pivot.  Pick middle index 3, pivot is 7
Step 3. Split the array into 1,4,3,7 and 9,0,2,5.  
call MergeSort( 1,4,3,7) and mergeSort(9,0,2,5)

## First MergeSort
Step 1. Size is 4, bigger than one
Step 2. Pivot will be 4
Step 3. Split the array into 1,4, 3,7
call mergeSort(1,4) and mergeSort( 3,7)

## Second MergeSort
Step 1. Size is 2, bigger than one
Step 2. Pivot will be 1,
Step 3. Split the array into 1 and 4


Inputs at this point:
1, 4, 3, 7, 9, 0, 2, 5

## Merge Process:
Inputs:
1,4

# For each one:  do a compare and swap
for( int i;0; i< arr.length; i++ ){
    if( arr[i] > arr[i+1]){
        temp = arr[i];
        arr[i]  = arr[i+1];
        arr[i] = tmp
    }
}

Input: 1, 4


Pass two:
inputs 1, 4, 3, 7
Pass one: 1,4,3,7
pass two: 1,3,4,7

Inputs: 9,0
Pass One: 0,9

Inputs: 2,5
Pass One: 2, 5

Inputs:
9,0,2,5
Pass One: 0,9,2,5
Pass Two: 0,2,9,5
Pass Three: 0,2,5,9

Inputs: 1,4,2,7,0,2,5,9

Pass One:1,4,2,7, 0,2,5,9
Pass Two:1,4,2,7, 0,2,5,9
Pass Three:1,4,2,7, 0,2,5,9
Pass Four:1,4,2,0, 7,2,5,9
Pass Five:1,4,2,0, 2,7,5,9



# Pivot Process
1. Pick a number
2. Put all the numbers to left of the pivot to 
3. Put all the numbers in the right of the pivot
4. Split array and repeat at pivot and repeat


# Questions:
1. What is the impact of picking first number in the array vs in the middle.  When I look at other algorithms they pick the pivot 
at the middle

2. Is this a top down merge sort?
3. How will bottom up merge sort work?
4. How is the merging of the arrays working from the split
5. Can we walk through the psuedo code

# Example to work through
Input: 1,4,3,7,9,0,2,5

Step 1: Pick 1 as start, pivot_index = 1

## Split Process:
 int new_arr
 ## Check if k is less than pivot
 new_arr[0] = 0
 
 int pivot_index = k+1; 1
 new_array[pivot_index] = pivot (1)
 ## Check if k is greater than pivot
 new_arr[2] = 4,3,7,9,2,5
 

## Repeat Sorting but split into 2 arrays:
pivot_index = 1

Split 1: [1]
Split 2: [4,3,7,9,0,2,5]

Split 1: Stops at 1

Split 2: 
    Pivot: 4, index in array2
    ## Check if smaller
    new_arr[2] = 3,0,2
    
    Array
    new_arr[3] = 3,0,2,4
    ## Check if bigger than 4
    new_arr[4] = 3,0,2,4,7,9,5
    
    Return Pivot is index is 4
    
Split 3:
    First Split: [4,3,7,9]
    
    Second Split: [0,2,5]
 



