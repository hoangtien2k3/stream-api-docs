package IntStream;

import java.util.stream.IntStream;

/**
 * để tạo ra một luồng dữ liệu theo cách lặp lại một hàm sinh giá trị, bắt đầu từ một giá trị khởi đầu
 *
 * static IntStream iterate(int seed, IntUnaryOperator f)
 *
 * static IntStream iterate(int seed, IntPredicate hasNext, IntUnaryOperator next)
 * */
public class iterate {
    public static void main(String[] args) {
        // static IntStream iterate(int seed, IntUnaryOperator f)
        // Tạo một luồng dữ liệu chứa các số tự nhiên từ 0 đến 9
        IntStream naturalNumbers = IntStream.iterate(0, n -> n + 1);

        // In ra 10 số tự nhiên từ luồng dữ liệu
        naturalNumbers.limit(10).forEach(System.out::println);


        System.out.println("\n");


        // VD2:
        // static IntStream iterate(int seed, IntPredicate hasNext, IntUnaryOperator next)
        // Tạo một IntStream chứa các số chẵn từ 0 đến 10
        // tuong tu vong for
        IntStream evenNumbers = IntStream.iterate(
                0,         // Giá trị khởi đầu
                n -> n < 10,    // Điều kiện tiếp tục: số phải nhỏ hơn 10
                n -> n + 2      // Hàm sinh số tiếp theo: tăng giá trị hiện tại lên 2 để có số chẵn
        );

        // In ra các số chẵn từ luồng dữ liệu
        evenNumbers.forEach(System.out::println);
    }
}
