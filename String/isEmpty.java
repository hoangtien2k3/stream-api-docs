package String;

// boolean isEmpty()
public class isEmpty {
    public static void main(String[] args) {
        String str1 = "";           // Chuỗi rỗng
        String str2 = "   ";        // Chuỗi chỉ chứa khoảng trắng
        String str3 = "Hello";      // Chuỗi chứa ký tự không phải khoảng trắng

        // Kiểm tra xem str1 có rỗng không
        System.out.println("str1 is empty: " + str1.isEmpty());

        // Kiểm tra xem str2 có rỗng không
        System.out.println("str2 is empty: " + str2.isEmpty());

        // Kiểm tra xem str3 có rỗng không
        System.out.println("str3 is empty: " + str3.isEmpty());
    }
}
