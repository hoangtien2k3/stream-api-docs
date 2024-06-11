package DoubleStream;

import java.util.stream.DoubleStream;

// Returns a builder for a DoubleStream.
// static DoubleStream.Builder builder()
public class builder {
    public static void main(String[] args) {
        DoubleStream.builder()
                .add(1.0)
                .add(2.0)
                .add(3.0)
                .add(4.0)
                .add(5.0)
                .build()
                .forEach(System.out::println);

    }
}
