package String;

import java.util.stream.Collectors;

// Returns a stream of int zero-extending the char values from this sequence.
// IntStream chars()
public class chars {
    public static void main(String[] args) {
        String str = "hello world";

        long count = str.chars().count();

        System.out.println("Number of characters: " + count);


        // VD2:
        String upperCaseStr = "hello world".chars()
                .mapToObj(c -> (char) c) // Chuyển đổi từng giá trị int trong Stream thành Character.
                .map(Character::toUpperCase) // Chuyển đổi mỗi Character thành chữ hoa.
                .map(String::valueOf) // Chuyển đổi mỗi Character thành String.
                .collect(Collectors.joining()); // Thu thập các chuỗi thành một chuỗi duy nhất.

        System.out.println("Upper case string: " + upperCaseStr);


        // VD3:
        String onlyLetters = "hello 123 world!".chars()
                .filter(Character::isLetter)
                .mapToObj(c -> (char) c)
                .map(String::valueOf)
                .collect(Collectors.joining());

        System.out.println("Only letters: " + onlyLetters);
    }
}
