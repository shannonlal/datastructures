# Selection Sort Psuedo Code

## Example

```java
int[] arr = {3,1,5,6,2,0,8}
```

### Step 1 find the smallest
smallest: 0, smallestIndex = 5
Move it to position smallestIndex = 0
```java
arr = {0,3,1,5,6,2,8}
```

### Step 2 find the smallest
smallest: 1, smallestIndex = 2
Move it to position smallestIndex = 1
```java
arr = {0,1,3,5,6,2,8}
```

### Step 3 find the smallest
smallest: 2, smallestIndex = 5
Move it to position smallestIndex = 2
```java
arr = {0,1,2,3,5,6,8}
```

### Step 4 find the smallest
smallest: 3, smallestIndex = 3
Move it to position smallestIndex = 3
```java
arr = {0,1,2,3,5,6,8}
```

### Step 5 find the smallest
smallest: 5, smallestIndex = 4
Move it to position smallestIndex = 4
```java
arr = {0,1,2,3,5,6,8}
```


### Step 6 find the smallest
smallest: 6, smallestIndex = 5
Move it to position smallestIndex = 5
```java
arr = {0,1,2,3,5,6,8}
```

## Psuedo Code
Initialize:
-- smallestIndex = 0

1. findSmallest number starting at previous smallestIndex
2. If found an element, swap the elements

## Psuedo Code for: findSmallest 

1. Starting at index smallestIndex, iterate through rest of list to find smallest element
2. Return the index in the array of the smallest element

```java
/**
* This function will iterate through the arr, starting previousSmallest, and return
* The index of the smallest number in the array
* @returns arr -- less than 0 if nothing found
*/
public static int findSmallest( int[] arr, int previousSmallest);
```


## Psuedo Code for: swap 

1. Given the array and two indexes, swap the values

```java
/**
* This function will swap the two values
*/
public static void swap( int[] arr, int firstIndex, int secondIndex);
```

## Code for algorithm 
```java
public static int[] sortArray( int[] arr){
    
    for( int i=0; i< arr.length; i++){
        int swapIndex = findSmallest( arr, i);
        
        if( swapIndex >= 0)
            swap( i, swapIndex);
    }
}
```

## Analysis of selection
1. What is complexity of this
2. Is this a stable algorithm
3. What is memory capacity


### Selection Sort: Complexity
i. Outer algorithm is N

ii. Inner Algorithm
-- First pass is N
-- Second pass is N-1
-- Third pass is N-2
-- Forth pass is N-3
--
This is an arithmatic Sum and is dependent on N

Most likely: (N<sup>2</sup>)/2

### Selection Sort: Stability

Scenarios:
1. Reversed List
i. Have to go through every item on out algorithm
ii. Have to go through every time on second algorithm
iii.  Have to swap half the items

1. Sorted List
i. Have to go through every item in the outer algorithm
ii. Have to go through every item on find smallest
iii. NO SWAPS made

Complexity is the still (N<sup>2</sup>)/2 but still operations will vary.

Need to add in comparason and exhange in ops


## Need to do
1. Insertion Sort
2. Bubble Sort
