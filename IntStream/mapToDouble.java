package IntStream;

import java.util.stream.IntStream;

// để chuyển đổi mỗi phần tử trong một luồng dữ liệu thành một giá trị kiểu double
// DoubleStream mapToDouble(IntToDoubleFunction mapper)
public class mapToDouble {
    public static void main(String[] args) {

        IntStream intStream = IntStream.rangeClosed(1, 5);

        // Sử dụng mapToDouble để chuyển đổi mỗi số nguyên thành số double (số nguyên * 1.5)
        // Kết quả là một DoubleStream chứa các số double đã chuyển đổi
        intStream.mapToDouble(n -> n * 1.5)
                .forEach(System.out::println);
    }
}
