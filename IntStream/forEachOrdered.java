package IntStream;

import java.util.Arrays;
import java.util.stream.IntStream;

// giữ nguyên thứ tự của các phần tử trong luồng
public class forEachOrdered {
    public static void main(String[] args) {
        // Tạo một IntStream chứa các số nguyên từ 1 đến 10
        IntStream intStream = IntStream.rangeClosed(1, 10);

        // In ra mỗi phần tử trong IntStream theo thứ tự
        intStream.parallel().forEachOrdered(System.out::println);


        // VD2:
        // Danh sách các từ
        String[] words = {"apple", "banana", "orange", "grape", "kiwi"};

        // In ra các từ theo thứ tự từ điển, sử dụng song song xử lý
        Arrays.asList(words)
                .parallelStream()
                .forEachOrdered(System.out::println);
    }
}
