package IntStream;

import java.util.stream.IntStream;

// để chuyển đổi mỗi phần tử trong một luồng dữ liệu thành một giá trị kiểu long
// LongStream mapToLong(IntToLongFunction mapper)
public class mapToLong {
    public static void main(String[] args) {
        IntStream intStream = IntStream.rangeClosed(1, 5);

        // Sử dụng mapToLong để chuyển đổi mỗi số nguyên thành số long (số nguyên * 1000)
        // Kết quả là một LongStream chứa các số long đã chuyển đổi
        intStream.mapToLong(n -> n * 1000L)
                .forEach(System.out::println);
    }
}
