package String;

// boolean isBlank()
public class isBlank {
    public static void main(String[] args) {
        String str1 = "";           // Chuỗi rỗng
        String str2 = "   ";        // Chuỗi chỉ chứa khoảng trắng
        String str3 = "Hello";      // Chuỗi chứa ký tự không phải khoảng trắng

        // Kiểm tra xem str1 có trống không
        System.out.println("str1 is blank: " + str1.isBlank());

        // Kiểm tra xem str2 có trống không
        System.out.println("str2 is blank: " + str2.isBlank());

        // Kiểm tra xem str3 có trống không
        System.out.println("str3 is blank: " + str3.isBlank());
    }
}
