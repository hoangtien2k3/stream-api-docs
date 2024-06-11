package String;

// để nối một chuỗi mới vào cuối chuỗi hiện tại.
// String concat(String str)
public class concat {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        String result = str1.concat(str2);

        System.out.println("Concatenated string: " + result);
    }
}
