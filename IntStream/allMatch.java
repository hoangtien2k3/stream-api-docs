package IntStream;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

/**
 * Kiem tra xem: tat ca cac phan tu phai theo lambda truyen vao: IntPredicate
 *
 * boolean allMatch(IntPredicate predicate)
 * */
public class allMatch {
    public static void main(String[] args) {

        /**
         * boolean allMatch(IntPredicate predicate)
         **/
        // VD1:
        IntStream intStream = IntStream.rangeClosed(1, 10); // Tạo một IntStream chứa các số từ 1 đến 10

        IntPredicate isPositive = n -> n > 0; // functional interface  // Định nghĩa một IntPredicate kiểm tra nếu một số lớn hơn 0

        boolean allPositive = intStream.allMatch(isPositive); // Kiểm tra xem tất cả các số trong intStream có lớn hơn 0 không

        System.out.println("Tất cả các số đều lớn hơn 0: " + allPositive); // In ra kết quả


        // VD2:
        // viet ngan gon:
        boolean check = IntStream.rangeClosed(1, 10)
                .allMatch(n -> n % 2 == 0);
        System.out.println("Tất cả các số có chẵn hay không: " + check);


        // VD3:
        IntStream intStream1 = IntStream.rangeClosed(1, 10); // Tạo một IntStream chứa các số từ 1 đến 10

        // Định nghĩa một IntPredicate kiểm tra nếu một số là số nguyên tố
        IntPredicate isPrime = n -> {
            if (n <= 1) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        };

        // Kiểm tra xem tất cả các số trong intStream có là số nguyên tố không
        boolean allPrime = intStream1.allMatch(isPrime);

        // In ra kết quả
        System.out.println("Tất cả các số đều là số nguyên tố: " + allPrime);

    }
}
