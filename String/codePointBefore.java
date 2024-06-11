package String;

// trả về mã code point của ký tự đứng trước ký tự tại vị trí được chỉ định
// int codePointBefore(int index)
public class codePointBefore {
    public static void main(String[] args) {
        String str = "Hello";

        // Lấy mã code point của ký tự đứng trước ký tự tại vị trí 3 trong chuỗi (vị trí bắt đầu từ 0)
        int codePoint = str.codePointBefore(3);

        System.out.println("Code point before position 3: " + codePoint);

        // In ra ký tự tương ứng với mã code point
        System.out.println("Character before position 3: " + Character.toString(codePoint));
    }
}
