package IntStream;

import java.util.stream.Stream;

// static IntStream.Builder builder()
public class builder {
    public static void main(String[] args) {
        // Tạo một Stream.Builder cho các chuỗi
        Stream.Builder<String> streamBuilder = Stream.builder();

        // Thêm các phần tử vào builder
        streamBuilder.add("one");
        streamBuilder.add("two");
        streamBuilder.add("three");
        streamBuilder.add("four");
        streamBuilder.add("five");

        // Xây dựng Stream từ builder và thực hiện một số thao tác
        Stream<String> stringStream = streamBuilder.build();

        // Lọc các chuỗi có độ dài lớn hơn 3 và in ra
        stringStream
                .filter(s -> s.length() > 3)
                .forEach(System.out::println);
    }
}
