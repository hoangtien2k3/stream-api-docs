package IntStream;

import java.util.stream.IntStream;

// kiểm tra xem không có phần tử nào trong luồng dữ liệu thỏa mãn một điều kiện cụ thể hay không
// boolean noneMatch(IntPredicate predicate)
public class noneMatch {
    public static void main(String[] args) {
        IntStream intStream = IntStream.rangeClosed(1, 10);

        // Kiểm tra xem không có số âm nào trong luồng dữ liệu không
        boolean noneNegative = intStream.noneMatch(n -> n < 0);

        if (noneNegative) {
            System.out.println("Không có số âm trong luồng dữ liệu.");
        } else {
            System.out.println("Có ít nhất một số âm trong luồng dữ liệu.");
        }
    }
}
