package String;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

// chuyển String -> byte[]
// byte[] getBytes()
// void getBytes(int srcBegin, int srcEnd, byte[] dst, int dstBegin)
// byte[] getBytes(String charsetName)
// byte[] getBytes(Charset charset)
public class getBytes {
    public static void main(String[] args) {
        String str = "Hello, World!";

        // Chuyển đổi chuỗi thành mảng byte
        byte[] byteArray = str.getBytes();

        // In ra mảng byte
        for (byte b : byteArray) {
            System.out.print(b + " ");
        }


        // VD1:
        // byte[] getBytes()
        String str1 = "Hello, World!";
        byte[] byteArray1 = str1.getBytes();
        System.out.println(byteArray1);


        // VD2:
        // void getBytes(int srcBegin, int srcEnd, byte[] dst, int dstBegin)
        String str2 = "Hello, World!";
        byte[] byteArray2 = new byte[str.length()];
        str2.getBytes(0, 5, byteArray2, 0); // Copy 5 ký tự đầu tiên từ "Hello" vào mảng byteArray từ vị trí 0
        System.out.println();


        // VD3:
        // byte[] getBytes(String charsetName)
        String str3 = "Hello, World!";
        byte[] byteArray3 = str3.getBytes(StandardCharsets.UTF_8);
        System.out.println(byteArray3);


        // VD4:
        // byte[] getBytes(Charset charset)
        String str4 = "Hello, World!";
        Charset charset = Charset.forName("UTF-8");
        byte[] byteArray4 = str.getBytes(charset);

    }
}
