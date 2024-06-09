package IntStream;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

/**
 * Để tính giá trị trung bình của các số nguyên trong một IntStream
 *
 * OptionalDouble average()
 * */
public class average {
    public static void main(String[] args) {
        // Tạo một IntStream chứa các số từ 1 đến 10
        IntStream intStream = IntStream.rangeClosed(1, 10);

        // Chuyển đổi IntStream thành LongStream và tính giá trị trung bình của các số
        OptionalDouble average = intStream
                .asLongStream()
                .average();

        // In ra kết quả
        if (average.isPresent()) {
            System.out.println("Trung bình của các số từ 1 đến 10: " + average.getAsDouble());
        } else {
            System.out.println("Không thể tính được giá trị trung bình");
        }
    }
}
