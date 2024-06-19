package IntStream;

import java.util.stream.IntStream;

// thực hiện một hàm biến đổi đa phần tử (multi-value mapping) trên mỗi phần tử trong luồng dữ liệu.
// default IntStream mapMulti(IntStream.IntMapMultiConsumer mapper)
public class mapMulti {
    public static void main(String[] args) {
        // Tạo một IntStream chứa các số nguyên từ 1 đến 5
        IntStream intStream = IntStream.rangeClosed(1, 5);

        // Sử dụng mapMulti để chuyển đổi mỗi số thành các số từ 1 đến số đó
        IntStream mappedStream = intStream.mapMulti((value, consumer) -> {
//            for (int i = 1; i <= value; i++) {
//                consumer.accept(i);
//            }
            IntStream.rangeClosed(1, value).forEach(consumer);
        });

        // In ra các số đã được chuyển đổi
        mappedStream.forEach(System.out::println);
    }
}
