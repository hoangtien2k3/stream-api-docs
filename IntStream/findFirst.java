package IntStream;

import java.util.OptionalInt;
import java.util.stream.IntStream;

/**
 * sử dụng để trả về một phần tử đầu tiên từ một luồng dữ liệu
 *
 * OptionalInt findFirst()
 * */
public class findFirst {
    public static void main(String[] args) {
        // Tạo một IntStream chứa các số nguyên từ 1 đến 100
        IntStream intStream = IntStream.rangeClosed(1, 100);

        // Tìm phần tử đầu tiên trong IntStream
        OptionalInt firstElement = intStream.findFirst();

        // Kiểm tra xem có phần tử đầu tiên nào không
        if (firstElement.isPresent()) {
            System.out.println("Phần tử đầu tiên: " + firstElement.getAsInt());
        } else {
            System.out.println("Không tìm thấy phần tử đầu tiên trong IntStream.");
        }
    }
}
