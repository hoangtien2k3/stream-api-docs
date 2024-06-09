package IntStream;

import java.util.stream.IntStream;

public class sorted {
    public static void main(String[] args) {
        IntStream intStream = IntStream.of(5, 3, 8, 1, 9);
        intStream.sorted().forEach(System.out::println);
    }
}
