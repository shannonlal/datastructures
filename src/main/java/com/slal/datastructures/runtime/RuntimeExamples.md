## Example 1:

```java
for( int i=0; i< n; i++){
    for( int j=0; j< n; j++){
        s.o.p(i);
    }
}

```

We can break this runtime into two loops:
1. Outer Loop
```Loop 1 - for( int i=0; i< n; i++){```

This will have a runtime of N or more accurately
1+ 3N
--Note: for 3n operations performed each time:
i<n; i++; operation on inner loop

2. Inner Loop

```java
for( int j=0; j< n; j++)
```
This will have a runtime of N same as above

There for runtime is:

Runtime: Outer Loop Runtime * Inner Loop Runtime

Runtime = (N)*(N) = (N<sup>2</sup>)

## Example 2:

```java
for( int i=0; i< n; i++){
    for( int j=0; j< m; j++){
        s.o.p(i);
    }
}

```

Runtime = Outer loop Runtime * Inner Loop Runtime

Runtime = n*m


## Example 3:

```java
for( int i=0; i< n; i++){
    for( int j=0; j< i; j++){
        s.o.p(i);
    }
}

```

We can break this runtime into two loops:
1. Outer Loop
```Loop 1 - for( int i=0; i< n; i++){```

This will have a runtime of n or more accurately
1+ 3n
--Note: for 3n operations performed each time:
i<n; i++; operation on inner loop

2. Inner Loop

```java
for( int j=0; j< i; j++)
```

The trick on this one is j will be based on i.  So 
the number of operations will be
1
2
3
4
5

Which follows the arithmetic sum:
which is N/2

There for runtime is:

Runtime: Outer Loop Runtime * Inner Loop Runtime

**Runtime** = (N)*(N/2) = (N<sup>2</sup>)/2

## Example 4:

```java
for( int i=0; i< n; i++){
    for( int j=0; j< m; j++){
        s.o.p(i);
    }
}

```

Runtime =  Runtime Outer * Runtime Inner

**Runtime** = N*M 

## Example 5:

```java
for( int i=0; i< n; i++){
    for( int j=0; j< i; j++){
        s.o.p(i);
    }
}

```

Runtime =  Runtime Outer * Runtime Inner

Note: Inner is arrathmatic sum:
N/2

**Runtime** = N*N/2 = (N<sup>2</sup>)/2

## Example 6:

```java
for( int i=0; i< n; i++)
    s.o.p(i);

for( int k=0; k< n; k++)
    s.o.p(k);

```

Runtime =  Loop 1 + Loop 2

**Runtime** = N + N = 2N or can say N

**Runtime** = N*N/2 = (N<sup>2</sup>)/2

## Example 7:

```java
for( int i=0; i< n^2; i++){
    for( int j=0; j < i; j++){
        s.o.p(i);
    }
}
```

Runtime =  Outer Loop * Inner Loop

**Outloop Runtime** = N<sup>2</sup>

**Inner Runtime** = (N<sup>2</sup>)/2

**Runtime** = (N<sup>2</sup>)*(N<sup>2</sup>)/2
            = (N<sup>4</sup>)/2