The following are some summary notes from recurrances

# Example 1

Given:
```java
T(n) = 2T(n/2)+1;
T(1) = 1
```

## Example 1: Investigate Pattern
1. Solve for N-1
```java
T(n) = 2T(n/2) +1

Therefore
T(n-1) = 2T((n-1)/2) + 1
```

2. Solve for N-2

```java
T(n) = 2T(n/2) +1

T(n-2) = 2T((n-2)/2) + 1
```

3. Solve for N-3

```java
T(n) = 2T(n/2) +1

T(n-3) = 2T((n-3)/2) + 1
```

## Example 1: Pattern

```java
T(n-i) = 2T((n-i)/2)+1

T(1) = 1

When-i = 1; 2T(n-i) = 1
n= i-1; 2T(n-i) = 1
```

## Example 1: Base Condition
```java
T(i) = 1
T(n) = 2T(n)+1
T(n-i) = 2T(n-i)+1
```

## Example 1: complexity
```java
Best Case Complexity: T(1) = 1; O(1)

Worst Case: T(n); O(n)
```

## Example 1: Complexity is O(n)

# Example 2

Given:
```java
T(n) = T(n-1)+ n
T(0) = 1;
```

## Example 2: Solve

n -1
```java
T(n-1) = T(n-2)+ n-1
```

n -2
```java
T(n-2) = T(n-3)+ n-2
```
n -3
```java
T(n-3) = T(n-4)+ n-3
```
## Example 2: Replacement

```java
T(n) = T(n-1) + n

T(n) = T(n-2)+ n-1 + n

T(n) = T(n-2) + 2n -1

T(n) = (T(n-3)+ n-2) + 2n -1

T(n) = T(n-3) + 3n -3
T(n) = T(n-i) + i(n-1)

T(0) = 1
T(n-i) = 1; n=i

T(n) = T(n-n) + n(n-1)
T(n) = T(0) + n(n-1)
T(n) = 1+ n(n-1)
```

T(n) = 1 if n=0
     = T(n-i) + i(n-1) if n > 0
     
## Example 2: Complexity

Best Case: n=i; T(0) = 1 -- O(1)

Worst Case; n^2; O(n^2)

Need to review
     
     





