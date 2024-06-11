package String;

// so sánh không phân biệt chữ hoa và chữ thường
// boolean equalsIgnoreCase(String anotherString)
public class equalsIgnoreCase {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";
        String str3 = "World";

        // So sánh str1 với str2 (phân biệt chữ hoa và chữ thường)
        boolean equals1 = str1.equals(str2);
        System.out.println("str1 equals str2 (case-sensitive): " + equals1);

        // So sánh str1 với str2 (không phân biệt chữ hoa và chữ thường)
        boolean equalsIgnoreCase1 = str1.equalsIgnoreCase(str2);
        System.out.println("str1 equalsIgnoreCase str2: " + equalsIgnoreCase1);

        // So sánh str1 với str3 (phân biệt chữ hoa và chữ thường)
        boolean equals2 = str1.equals(str3);
        System.out.println("str1 equals str3 (case-sensitive): " + equals2);

        // So sánh str1 với str3 (không phân biệt chữ hoa và chữ thường)
        boolean equalsIgnoreCase2 = str1.equalsIgnoreCase(str3);
        System.out.println("str1 equalsIgnoreCase str3: " + equalsIgnoreCase2);
    }
}
