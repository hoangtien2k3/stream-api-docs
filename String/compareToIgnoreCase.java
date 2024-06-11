package String;

// so sánh hai chuỗi dựa trên thứ tự từ điển, tương tự như compareTo(String anotherString).
// Tuy nhiên, phương thức này không phân biệt chữ hoa chữ thường khi so sánh.
public class compareToIgnoreCase {
    public static void main(String[] args) {
        String str1 = "Apple";
        String str2 = "apple";

        int result = str1.compareToIgnoreCase(str2);

        if (result < 0) {
            System.out.println(str1 + " is less than " + str2);
        } else if (result > 0) {
            System.out.println(str1 + " is greater than " + str2);
        } else {
            System.out.println(str1 + " is equal to " + str2);
        }
    }
}
