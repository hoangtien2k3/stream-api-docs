package IntStream;

import java.util.OptionalInt;
import java.util.stream.IntStream;

//  sử dụng để thực hiện một phép biến đổi hóa (reduction) trên tất cả các phần tử trong luồng dữ liệu để tạo ra một kết quả duy nhất
// int reduce(int identity, IntBinaryOperator op)
// OptionalInt reduce(IntBinaryOperator op)
public class reduce {
    public static void main(String[] args) {
        // VD1:
        IntStream intStream = IntStream.rangeClosed(1, 5);
        int sum = intStream.reduce(0, Integer::sum);
        System.out.println("Tổng của các số là: " + sum);


        // VD2:
        IntStream intStream1 = IntStream.of(5, 3, 8, 1, 9);
        int min = intStream1.reduce(Integer.MAX_VALUE, Integer::min);
        System.out.println("Số nhỏ nhất trong luồng dữ liệu là: " + min);


        // VD3:
        IntStream intStream2 = IntStream.rangeClosed(1, 5);
        OptionalInt sumOptional = intStream2.reduce(Integer::sum);

        if (sumOptional.isPresent()) {
            System.out.println("Tổng của các số là: " + sumOptional.getAsInt());
        } else {
            System.out.println("Luồng dữ liệu rỗng.");
        }

    }
}
