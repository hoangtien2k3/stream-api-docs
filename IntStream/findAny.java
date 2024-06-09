package IntStream;

import java.util.OptionalInt;
import java.util.stream.IntStream;

/**
 * sử dụng để trả về một phần tử bất kỳ từ một luồng dữ liệu
 *
 * OptionalInt findAny()
 * */
public class findAny {
    public static void main(String[] args) {
        // Tạo một IntStream chứa các số nguyên từ 1 đến 100
        IntStream intStream = IntStream.rangeClosed(1, 100);

        // Tìm một số chia hết cho 15 trong IntStream
        OptionalInt divisibleBy15 = intStream.filter(n -> n % 15 == 0).findAny();

        // Kiểm tra xem có tìm thấy số chia hết cho 15 hay không
        if (divisibleBy15.isPresent()) {
            System.out.println("Số chia hết cho 15: " + divisibleBy15.getAsInt());
        } else {
            System.out.println("Không tìm thấy số chia hết cho 15 trong IntStream.");
        }
    }
}
