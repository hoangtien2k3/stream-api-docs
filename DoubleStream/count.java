package DoubleStream;

import java.util.stream.DoubleStream;

public class count {
    public static void main(String[] args) {
        long doubleStream = DoubleStream.of(1.0, 2.0, 3.0, 4.0, 5.0)
                .distinct()
                .count();

        System.out.println(doubleStream);
    }
}
