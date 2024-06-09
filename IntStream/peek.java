package IntStream;

import java.util.stream.IntStream;

// Nó trả về một luồng dữ liệu mới chứa các phần tử gốc và vẫn giữ nguyên cấu trúc của luồng dữ liệu ban đầu.
// IntStream peek(IntConsumer action)
public class peek {
    public static void main(String[] args) {
        IntStream intStream = IntStream.rangeClosed(1, 5);

        intStream.peek(x -> System.out.println(" - " + x))
                .map(n -> n * 2)                // Giả sử có một xử lý tiếp theo
                .forEach(System.out::println);  // In ra kết quả cuối cùng
    }
}
