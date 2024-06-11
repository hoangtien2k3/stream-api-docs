package DoubleStream;

import java.util.stream.DoubleStream;

/**
 * Returns whether all elements of this stream match the provided predicate.
 *
 * boolean allMatch(DoublePredicate predicate)
 * **/
public class allMatch {
    public static void main(String[] args) {
        DoubleStream doubleStream = DoubleStream.of(1.0,2.0,3.0,4.0,5.0);
        boolean result = doubleStream.allMatch(x -> x > 0);
        System.out.println("Tất cả các phần tử > 0: " + result);
    }
}
