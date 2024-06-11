package String;

// để kiểm tra xem chuỗi hiện tại có chứa một chuỗi con đã cho hay không.
// boolean contains(CharSequence s)
public class contains {
    public static void main(String[] args) {
        String str = "Hello, World!";

        // Kiểm tra xem chuỗi "Hello" có tồn tại trong chuỗi str hay không
        boolean containsHello = str.contains("Hello");
        System.out.println("Contains 'Hello': " + containsHello);

        // Kiểm tra xem chuỗi "world" (chữ thường) có tồn tại trong chuỗi str hay không
        boolean containsWorld = str.contains("world");
        System.out.println("Contains 'world': " + containsWorld);

        // Kiểm tra xem chuỗi "abc" có tồn tại trong chuỗi str hay không
        boolean containsABC = str.contains("abc");
        System.out.println("Contains 'abc': " + containsABC);
    }
}
