package IntStream;

import java.util.stream.IntStream;

/**
 * convert IntStream -> LongStream
 *
 * LongStream asLongStream()
 * */
public class asLongStream {
    public static void main(String[] args) {
        // Tạo một IntStream chứa các số từ 1 đến 10
        IntStream intStream = IntStream.rangeClosed(1, 10);

        // Chuyển đổi IntStream thành LongStream và tính tổng của các số
        long sum = intStream
                .asLongStream()
                .sum();

        // In ra kết quả
        System.out.println("Tổng của các số từ 1 đến 10: " + sum);
    }
}
