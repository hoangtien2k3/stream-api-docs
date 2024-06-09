package IntStream;

import java.util.stream.IntStream;

public class map {
    public static void main(String[] args) {
        IntStream intStream = IntStream.rangeClosed(1, 5)
                .map(n -> n * 2);

        intStream.forEach(System.out::println);
    }
}
