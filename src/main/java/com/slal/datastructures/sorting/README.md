# Sorting Alogirthm Notes:

## Insertion Sort

1. Iterate from the left of the array (start) to the end
2. For each element (i) compare it to the previous element (j = i-1)
3. If i < j do the following:
i. Loop from j to beginning of array
ii. Compare the value at i (key) to the j value.  If key is smaller the jth value. then attempt j-1
iii.  If not do nothing

### Notes for Insertion Sort
1. Complexity is O(n) if already sorted
2. Complexity is O(n2) if reversed
3. This is an in memory sorting algorithm

