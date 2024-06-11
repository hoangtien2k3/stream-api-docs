package String;

// để kiểm tra xem chuỗi kết thúc bằng một chuỗi con đã cho hay không.
// boolean endsWith(String suffix)
public class endsWith {
    public static void main(String[] args) {
        String str = "Hello, World";

        // Kiểm tra xem chuỗi kết thúc bằng "World"
        boolean endsWithWorld = str.endsWith("World");
        System.out.println("Ends with 'World': " + endsWithWorld);

        // Kiểm tra xem chuỗi kết thúc bằng "world" (chữ thường)
        boolean endsWithWorldLowercase = str.endsWith("world");
        System.out.println("Ends with 'world' (case-sensitive): " + endsWithWorldLowercase);
    }
}
