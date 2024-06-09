package IntStream;

import java.util.stream.IntStream;

// để tạo một luồng dữ liệu từ một chuỗi các phần tử được cung cấp
// static IntStream of(int t)
// static IntStream of(int... values)
public class of {
    public static void main(String[] args) {
        IntStream intStream = IntStream.of(1, 2, 3, 4, 5);
        intStream.forEach(System.out::println);
    }
}
