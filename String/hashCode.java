package String;

// tính toán mã băm của chuỗi dựa trên các ký tự trong chuỗi.
// int hashCode()
public class hashCode {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        // Tính toán mã băm của chuỗi str1
        int hashCode1 = str1.hashCode();
        System.out.println("HashCode of str1: " + hashCode1);

        // Tính toán mã băm của chuỗi str2
        int hashCode2 = str2.hashCode();
        System.out.println("HashCode of str2: " + hashCode2);
    }
}
