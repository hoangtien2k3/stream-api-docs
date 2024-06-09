package IntStream;

import java.util.stream.IntStream;

// static IntStream rangeClosed(int startInclusive, int endInclusive)
public class rangeClosed {
    public static void main(String[] args) {
        IntStream intStream = IntStream.rangeClosed(1, 5);
        intStream.forEach(System.out::println);
    }
}
