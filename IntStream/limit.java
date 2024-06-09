package IntStream;

import java.util.stream.IntStream;

// IntStream limit(long maxSize)
public class limit {
    public static void main(String[] args) {
        IntStream intStream = IntStream.rangeClosed(1, 100)
                .limit(10);

        intStream.forEach(System.out::println);
    }
}
