The following are some summary notes from recurrances

# Example 1

```java
T(n) = 2T(n/2)+1;
T(1) = 1

Work through
T(n-1) =  2T[2*T(n/2) + 1)]+1
        = 4T(n/2) + 2 + 1
        = 
T(n-2) = 2T((n-2)/2) +1

```