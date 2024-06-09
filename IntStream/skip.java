package IntStream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

// sử dụng để bỏ qua n phần tử đầu tiên trong luồng dữ liệu và trả về một luồng mới mà không bao gồm các phần tử đã bị bỏ qua.
// IntStream skip(long n)
public class skip {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.iterate(1, n -> n + 1)
                .limit(10);
        stream.skip(3).forEach(System.out::println);


        // VD2:
        IntStream intStream = IntStream.rangeClosed(1, 10);
        intStream.skip(3)
                .forEach(System.out::println);
    }
}
