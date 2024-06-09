package IntStream;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

/**
 * tính toán các thống kê mô tả cơ bản về các số trong luồng dữ liệu, như tổng, trung bình, giá trị nhỏ nhất, giá trị lớn nhất và số lượng phần tử.
 * Phương thức này trả về một đối tượng IntSummaryStatistics chứa các thông tin này.
 *
 * default IntStream takeWhile(IntPredicate predicate)
 * */
public class takeWhile {
    public static void main(String[] args) {
        IntStream intStream = IntStream.rangeClosed(1, 10);

        // Tính toán các thống kê mô tả về các số trong luồng dữ liệu
        IntSummaryStatistics stats = intStream.summaryStatistics();

        // In ra các thống kê mô tả
        System.out.println("Tổng: " + stats.getSum());
        System.out.println("Trung bình: " + stats.getAverage());
        System.out.println("Số lượng phần tử: " + stats.getCount());
        System.out.println("Giá trị nhỏ nhất: " + stats.getMin());
        System.out.println("Giá trị lớn nhất: " + stats.getMax());
    }
}
