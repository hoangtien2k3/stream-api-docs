package DoubleStream;

import java.util.stream.DoubleStream;

/**
 * Returns whether any elements of this stream match the provided predicate.
 * <p>
 * boolean anyMatch(DoublePredicate predicate)
 **/
public class anyMatch {
    public static void main(String[] args) {
        DoubleStream stream = DoubleStream.of(1.0, 2.0, 3.0, 4.0, 5.0);
        boolean match = stream.anyMatch(p -> p > 3);
        System.out.println(match);
    }
}
