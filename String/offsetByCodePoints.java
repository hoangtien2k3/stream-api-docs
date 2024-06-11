package String;


/**
 * Tính toán vị trí của một điểm mã Unicode trong một chuỗi dựa trên một số lượng mã Unicode cụ thể.
 *
 * int offsetByCodePoints(int index, int codePointOffset)
 *
 * Trong đó:
 * -  index  là vị trí ban đầu của điểm mã Unicode trong chuỗi.
 * -  codePointOffset  là số lượng mã Unicode mà bạn muốn di chuyển vị trí của điểm mã Unicode.
 * **/
// int offsetByCodePoints(int index, int codePointOffset)
public class offsetByCodePoints {
    public static void main(String[] args) {
        String str = "Hello, World!";
        int index = 6; // Vị trí của 'W' là 6
        int offset = 3; // Di chuyển vị trí 3 mã Unicode
        int newIndex = str.offsetByCodePoints(index, offset); // Vị trí mới của 'W' là 9: (vị trí `W`: 6, sau đó dịch vị trí 3 Unicode) => kết quả là: 9
        System.out.println("Vị trí mới sau di chuyển là: " + newIndex);
    }
}
