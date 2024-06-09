package IntStream;

import java.util.stream.IntStream;

/**
 * Kiem tra xem: bat ky ca cac phan tu phai theo lambda truyen vao: IntPredicate
 *
 * boolean anyMatch(IntPredicate predicate)
 * */
public class anyMatch {
    public static void main(String[] args) {

        // kiểm tra xem từ 1 -> 10 có số nào chẵn hay không
        boolean check = IntStream.rangeClosed(1, 10)
                .anyMatch(n -> n % 2 == 0);

        System.out.println("Co so chan khong: " + check);

    }
}
