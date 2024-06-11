package String;

import java.util.stream.Stream;

// lines: chuyển String -> String<String>
// Stream<String> lines()
public class lines {
    public static void main(String[] args) {
        // Tạo một Stream<String> chứa các dòng trong chuỗi
        String text = "Hello\nThis is a\nMulti-line\nString";
        Stream<String> linesStream = Stream.of(text)
                .flatMap(str -> Stream.of(str.split("\n")));
        linesStream.forEach(System.out::println);  // In ra từng dòng trong Stream


        // VD2: Chuỗi chứa nhiều dòng
        String text1 = "Line 1\nLine 2\nLine 3\nLine 4";
        Stream<String> linesStream1 = text1.lines();    // Chuyển chuỗi thành Stream của các dòng
        linesStream1.forEach(System.out::println);      // In ra từng dòng trong Stream
    }
}
