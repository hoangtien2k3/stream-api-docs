package IntStream;

import java.util.stream.IntStream;

/**
 * sử dụng để nối hai luồng dữ liệu lại với nhau
 *
 * static IntStream concat(IntStream a, IntStream b)
 * */
public class concat {
    public static void main(String[] args) {
        // Tạo hai IntStream
        IntStream intStream1 = IntStream.rangeClosed(1, 5);
        IntStream intStream2 = IntStream.rangeClosed(6, 10);

        // Nối hai IntStream lại với nhau
        IntStream concatenatedStream = IntStream.concat(intStream1, intStream2);

        // In ra các phần tử của luồng đã nối
        concatenatedStream.forEach(System.out::println);
    }
}
