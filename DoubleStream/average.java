package DoubleStream;

import java.util.stream.DoubleStream;
import java.util.stream.Stream;

// Returns an OptionalDouble describing the arithmetic mean of elements of this stream, or an empty optional if this stream is empty.
// OptionalDouble average()
public class average {
    public static void main(String[] args) {
        DoubleStream stream = DoubleStream.of(1.0, 2.0, 3.0, 4.0, 5.0);
        stream.average().ifPresent(System.out::println);

        DoubleStream stream1 = DoubleStream.empty();
        stream1.average().ifPresent(System.out::println);

    }
}
