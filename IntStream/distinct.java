package IntStream;

import java.util.stream.IntStream;

/**
 * loại bỏ các phần tử trùng lặp
 *
 * IntStream distinct()
 * */
public class distinct {
    public static void main(String[] args) {

        IntStream intStream = IntStream.of(1, 2, 3, 2, 4, 5, 3, 6, 7, 6, 8, 9);

        IntStream distinctIntStream = intStream.distinct();

        distinctIntStream.forEach(System.out::println);
    }
}
