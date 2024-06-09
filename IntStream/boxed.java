package IntStream;

import java.util.List;
import java.util.stream.IntStream;

/**
 * chuyển đổi một IntStream thành một Stream<Integer>
 *
 * Stream<Integer> boxed()
 */
public class boxed {
    public static void main(String[] args) {
        // Tạo một IntStream chứa các số từ 1 đến 10
        IntStream intStream = IntStream.rangeClosed(1, 10);

        // Chuyển đổi IntStream thành Stream<Integer>
        List<Integer> integerList = intStream
                .boxed() // convert Stream<Integer>
                .toList();

        // In ra danh sách các số nguyên
        System.out.println("Danh sách các số nguyên: " + integerList);
    }
}
