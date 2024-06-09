package IntStream;

import java.util.stream.IntStream;

/**
 * đếm số lượng phần tử trong một luồng dữ liệu
 *
 * long count()
 */
public class count {
    public static void main(String[] args) {

        IntStream intStream = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        long count = intStream.count();

        System.out.println("So Luong: " + count);

    }
}
