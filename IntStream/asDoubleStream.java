package IntStream;

import java.util.stream.IntStream;

/**
 * Chuyen IntStream -> DoubleStream
 *
 * DoubleStream asDoubleStream()
 * */
public class asDoubleStream {
    public static void main(String[] args) {
        IntStream intStream = IntStream.rangeClosed(1, 10);
        intStream.asDoubleStream() // convert IntStream -> DoubleStream
                .map(Math::sqrt)
                .forEach(d -> System.out.printf("%.2f ", d));
    }
}
