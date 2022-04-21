package com.slal.datastructures.algorithms.connectivity;

import java.util.Objects;

public class UniquePair {
    private Integer a;
    private Integer b;

    public UniquePair() {
    }

    public UniquePair(Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UniquePair)) return false;
        UniquePair that = (UniquePair) o;

        if(
                ( a.equals( a )&& b.equals(a)) ||
                        ( a.equals( b )&& b.equals(a))
        ){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
}
