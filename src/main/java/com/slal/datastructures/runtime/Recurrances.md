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



