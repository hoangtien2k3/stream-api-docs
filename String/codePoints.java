package String;

import java.util.stream.IntStream;

// để tạo một IntStream của các mã code point từ một chuỗi.
// Mã code point là một số nguyên không dấu, đại diện cho một ký tự Unicode.
// Returns a stream of code point values from this sequence.
// IntStream codePoints()
public class codePoints {
    public static void main(String[] args) {
        String str = "Hello 😊";

        // Tạo IntStream từ chuỗi
        IntStream codePointsStream = str.codePoints();

        // In ra mã code points
        codePointsStream.forEach(System.out::println);
    }
}
