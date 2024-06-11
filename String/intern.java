package String;

import java.util.HashMap;
import java.util.Map;

/**
 * để thực hiện quá trình "internalization" cho một chuỗi.
 * Quá trình này là một quá trình quan trọng trong quản lý bộ nhớ và tối ưu hóa hiệu suất của các ứng dụng Java.
 *
 * **/
// String intern()
public class intern {
    private static final Map<String, String> nameToEmailMap = new HashMap<>();

    public static void addUser(String name, String email) {
        String internedName = name.intern(); // Internalization cho tên người dùng
        String internedEmail = email.intern(); // Internalization cho địa chỉ email

        // Thêm vào bản đồ nếu chưa tồn tại
        nameToEmailMap.put(internedName, internedEmail);
    }

    public static String getEmail(String name) {
        return nameToEmailMap.get(name.intern()); // Truy xuất địa chỉ email với tên người dùng đã internalized
    }


    public static void main(String[] args) {
        String str1 = new String("Hello");
        String str2 = "Hello";

        // Thực hiện internalization cho chuỗi str1
        String internedStr1 = str1.intern();

        // So sánh tham chiếu giữa str1 và str2
        System.out.println("str1 == str2: " + (str1 == str2));

        // So sánh tham chiếu giữa internedStr1 và str2
        System.out.println("internedStr1 == str2: " + (internedStr1 == str2));



        // VD2:
        // Thêm một số người dùng vào danh bạ
        addUser("Alice", "alice@example.com");
        addUser("Bob", "bob@example.com");
        addUser("Alice", "anotheralice@example.com"); // Thêm người dùng khác cùng tên

        // Truy xuất địa chỉ email của một số người dùng
        System.out.println("Email of Alice: " + getEmail("Alice")); // Dự kiến sẽ in ra "alice@example.com"
        System.out.println("Email of Bob: " + getEmail("Bob")); // Dự kiến sẽ in ra "bob@example.com"


    }
}
