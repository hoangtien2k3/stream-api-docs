package IntStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * bỏ qua các phần tử đầu tiên của một luồng dữ liệu cho đến khi một điều kiện nhất định không còn đúng nữa
 *
 * IntStream dropWhile(IntPredicate predicate)
 * */
public class dropWhile {
    public static void main(String[] args) {
        // Tạo một IntStream chứa các số nguyên từ 1 đến 10
        IntStream intStream = IntStream.rangeClosed(1, 10);

        // Bỏ qua các số nguyên nhỏ hơn 5
        IntStream droppedStream = intStream.dropWhile(n -> n < 5);

        // In ra các số nguyên sau khi đã bỏ qua
        droppedStream.forEach(System.out::println);


        // VD2:
        List<Double> scores = Arrays.asList(8.7, 9.1, 8.3, 9.5, 8.0, 7.9, 9.0, 8.8);

        // Sử dụng dropWhile để bỏ qua các học sinh có điểm dưới 8.5
        List<Double> highScorers = scores.stream()
                .dropWhile(score -> score < 8.5)
                .toList();

        System.out.println("Học sinh đạt điểm cao: " + highScorers);
    }
}
