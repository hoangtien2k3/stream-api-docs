package IntStream;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * để tạo ra một luồng dữ liệu vô hạn bằng cách cung cấp một hàm sinh giá trị
 *
 * static IntStream generate(IntSupplier s)
 * */
public class generate {
    public static void main(String[] args) {
        // Tạo một luồng dữ liệu vô hạn chứa các số nguyên dương từ 1 đến vô cùng
        Stream<Integer> infiniteStream = Stream.generate(() -> 1);

        // In ra 10 số nguyên từ luồng dữ liệu vô hạn
        infiniteStream
                .limit(10)
                .forEach(System.out::println);


        // VD2:
        // Tạo một luồng dữ liệu vô hạn chứa các số nguyên ngẫu nhiên từ 0 đến 100
        IntStream infiniteIntStream = new Random().ints();

        // Giới hạn luồng dữ liệu vô hạn và in ra 10 số nguyên
        infiniteIntStream
                .limit(10)
                .forEach(System.out::println);
    }
}
