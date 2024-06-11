package String;

/**
 * để tìm vị trí xuất hiện đầu tiên của một ký tự hoặc chuỗi trong chuỗi hiện tại.
 * **/
// int indexOf(int ch)
// int indexOf(int ch, int fromIndex)
// int indexOf(String str)
// int indexOf(String str, int fromIndex)
public class indexOf {
    public static void main(String[] args) {
        // VD1:
        String str = "Hello, world!";
        int index = str.indexOf('o'); // Tìm vị trí của ký tự 'o'
        System.out.println(index);


        // VD2:
        String str1 = "Hello, world!";
        int index1 = str1.indexOf('o', 5); // Tìm vị trí của ký tự 'o' từ vị trí chỉ mục 5 trở đi
        System.out.println(index1);


        //VD3:
        String str2 = "Hello, world!";
        int index2 = str2.indexOf("world"); // Tìm vị trí của chuỗi "world"
        System.out.println(index2);


        // VD4:
        String str3 = "Hello, world!";
        int index3 = str3.indexOf("world", 7); // Tìm vị trí của chuỗi "world" từ vị trí chỉ mục 7 trở đi
        System.out.println(index3);

    }
}
