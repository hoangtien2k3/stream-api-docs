package IntStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * chuyển đổi mỗi phần tử của một luồng dữ liệu thành một luồng mới và sau đó hợp nhất các luồng con này thành một luồng duy nhất
 *
 * IntStream flatMap(IntFunction<? extends IntStream> mapper)
 * */
public class flatMap {
    public static void main(String[] args) {
        // Tạo một danh sách các từ
        List<String> words = Arrays.asList("Hello", "World");

        // Sử dụng flatMap để hợp nhất các ký tự của các từ thành một luồng duy nhất
        Stream<Character> characters = words.stream()
                .flatMap(word -> word.chars().mapToObj(c -> (char) c));

        // In ra các ký tự từ luồng duy nhất
        characters.forEach(System.out::println);


        // VD2:
        List<int[]> integerArrays = Arrays.asList(new int[]{1, 2, 3}, new int[]{4, 5, 6}, new int[]{7, 8, 9});

        // Sử dụng flatMap để hợp nhất tất cả các số nguyên thành một luồng duy nhất
        IntStream integerStream = integerArrays.stream()
                .flatMapToInt(Arrays::stream);

        // In ra các số nguyên từ luồng duy nhất
        integerStream.forEach(System.out::println);
    }
}
