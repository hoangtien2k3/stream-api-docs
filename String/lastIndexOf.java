package String;

// để tìm vị trí xuất hiện cuối cùng của một chuỗi con cụ thể trong chuỗi đã cho
// int lastIndexOf(int ch)
// int lastIndexOf(int ch, int fromIndex)
// int lastIndexOf(String str)
// int lastIndexOf(String str, int fromIndex)
public class lastIndexOf {
    public static void main(String[] args) {
        String str = "Hello, World! Hello";
        int lastIndex = str.lastIndexOf("Hello");
        System.out.println("Vị trí xuất hiện cuối cùng của chuỗi 'Hello' là: " + lastIndex);


        // VD2: int lastIndexOf(int ch, int fromIndex)
        String str1 = "Hello, World!";
        int lastIndex1 = str1.lastIndexOf('o', 5);
        System.out.println("Vị trí xuất hiện cuối cùng của ký tự 'o' trước vị trí 5 là: " + lastIndex1);


        // VD3: int lastIndexOf(String str)
        String str2 = "Hello, World!";
        int lastIndex2 = str2.lastIndexOf("World");
        System.out.println("Vị trí xuất hiện cuối cùng của chuỗi 'World' là: " + lastIndex2);

    }
}
