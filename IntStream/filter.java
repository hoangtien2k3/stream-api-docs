package IntStream;

import java.util.stream.IntStream;

/**
 * để lọc các phần tử
 *
 * IntStream filter(IntPredicate predicate)
 * */
public class filter {
    public static void main(String[] args) {
        // Lọc các số chẵn từ IntStream
        IntStream evenNumbers = IntStream.rangeClosed(1, 10)
                .filter(n -> n % 2 == 0);

        // In ra các số chẵn
        evenNumbers.forEach(System.out::println);
    }
}
