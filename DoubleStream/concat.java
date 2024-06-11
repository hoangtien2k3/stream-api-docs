package DoubleStream;

import java.util.stream.DoubleStream;

// static DoubleStream concat(DoubleStream a, DoubleStream b)
public class concat {
    public static void main(String[] args) {
        DoubleStream stream1 = DoubleStream.of(1.0, 2.0, 3.0);
        DoubleStream stream2 = DoubleStream.of(4.0, 5.0, 6.0);

        DoubleStream resultStream = DoubleStream.concat(stream1, stream2);
        resultStream.forEach(System.out::println);
    }
}
