package IntStream;

import java.util.stream.IntStream;

// chuyển đổi một luồng dữ liệu thành một mảng
public class toArray {
    public static void main(String[] args) {
        IntStream intStream = IntStream.rangeClosed(1, 5);

        int[] array = intStream.toArray();

        for (int num : array) {
            System.out.println(num);
        }
    }
}
