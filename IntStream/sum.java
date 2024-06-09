package IntStream;

import java.util.stream.IntStream;

// int sum()
public class sum {
    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(1, 5)
                .sum();
        System.out.println("Tổng của các số là: " + sum);
    }
}
