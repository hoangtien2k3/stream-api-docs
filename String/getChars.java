package String;

// sử dụng để sao chép một phần của chuỗi vào một mảng ký tự đích.
/**
 * srcBegin: chỉ mục của ký tự đầu tiên trong chuỗi nguồn để sao chép.
 * srcEnd: chỉ mục của ký tự kết thúc (không bao gồm) trong chuỗi nguồn để sao chép.
 * dst: mảng ký tự đích để sao chép vào.
 * dstBegin: chỉ mục bắt đầu của mảng đích để sao chép vào.
 * **/
// void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
public class getChars {
    public static void main(String[] args) {
        String str = "Hello, World!";
        char[] charArray = new char[5];

        // Sao chép 5 ký tự đầu tiên từ chuỗi vào mảng charArray
        str.getChars(0, 5, charArray, 0);

        // In ra mảng charArray
        System.out.println("Copied characters: ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
    }
}
