package String;

//  để tạo một chuỗi mới từ một mảng ký tự đã cho.
// static String copyValueOf(char[] data)
// static String copyValueOf(char[] data, int offset, int count)
public class copyValueOf {
    public static void main(String[] args) {
        char[] data = {'H', 'e', 'l', 'l', 'o'};
        String str = String.copyValueOf(data); // Tạo một chuỗi từ mảng ký tự data
        System.out.println("String created from char array: " + str);


        // VD2:
        char[] data1 = {'H', 'e', 'l', 'l', 'o'};
        String newString = new String(data1);
        System.out.println("String created from char array: " + data1);


        // VD3:
        char[] data2 = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'};

        // Tạo một chuỗi từ mảng ký tự data, bắt đầu từ chỉ mục 6 (ký tự 'W') và có độ dài 5
        String str2 = String.copyValueOf(data2, 6, 5);

        System.out.println("String created from a part of char array: " + str2);
    }
}
