package String;

// trả về mã code point của ký tự tại vị trí được chỉ định
// int codePointBefore(int index)
public class codePointAt {
    public static void main(String[] args) {
        String str = "Hello";

        // Lấy mã code point của ký tự tại vị trí 1 trong chuỗi (vị trí bắt đầu từ 0)
        int codePoint = str.codePointAt(1);

        System.out.println("Code point at position 1: " + codePoint);

        // In ra ký tự tương ứng với mã code point
        System.out.println("Character at position 1: " + Character.toString(codePoint));
    }
}
