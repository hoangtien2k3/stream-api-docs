package IntStream;

import java.util.stream.IntStream;

// void forEach(IntConsumer action)
public class forEach {
    public static void main(String[] args) {
        // Tạo một IntStream chứa các số nguyên từ 1 đến 10
        IntStream intStream = IntStream.rangeClosed(1, 10);

        // In ra mỗi phần tử trong IntStream
        intStream.forEach(System.out::println);
    }
}
