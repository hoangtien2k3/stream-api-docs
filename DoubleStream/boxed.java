package DoubleStream;

import java.util.stream.DoubleStream;
import java.util.stream.Stream;

// Convert DoubleStream -> Stream<Double>
// Returns a Stream consisting of the elements of this stream, boxed to Double.
// Stream<Double> boxed()
public class boxed {
    public static void main(String[] args) {
        DoubleStream doubleStream = DoubleStream.of(1.0, 2.0, 3.0);
        Stream<Double> stream = doubleStream.boxed();
        stream.forEach(System.out::println);
    }
}
