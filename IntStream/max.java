package IntStream;

import java.util.OptionalInt;
import java.util.stream.IntStream;

// sử dụng để tìm phần tử lớn nhất trong một luồng dữ liệu
// OptionalInt max()
public class max {
    public static void main(String[] args) {
        OptionalInt intStream = IntStream.rangeClosed(1, 10)
                .max();

        // Kiểm tra xem có phần tử lớn nhất không và in ra giá trị nếu có
        if (intStream.isPresent()) {
            System.out.println("Số lớn nhất trong luồng dữ liệu là: " + intStream.getAsInt());
        } else {
            System.out.println("Luồng dữ liệu là trống.");
        }
    }
}
