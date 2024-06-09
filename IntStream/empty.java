package IntStream;

import java.util.stream.IntStream;

/**
 * Phương thức empty() được sử dụng để tạo một luồng dữ liệu trống
 * <p>
 * static IntStream empty()
 */
public class empty {
    public static void main(String[] args) {
        // Tạo một IntStream trống
        IntStream emptyIntStream = IntStream.empty();

        // Lấy số lượng phần tử trong IntStream
        long count = emptyIntStream.count();

        // In ra số lượng phần tử
        System.out.println("Số lượng phần tử trong IntStream: " + count);
    }
}
