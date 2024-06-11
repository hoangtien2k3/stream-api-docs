package String;

// đếm số lượng mã code point giữa hai vị trí trong một chuỗi
// int codePointCount(int beginIndex, int endIndex)
public class codePointCount {
    public static void main(String[] args) {

        String str = "Hello 😊";

        // Đếm số lượng mã code point giữa vị trí 0 (bao gồm) và vị trí 6 (không bao gồm)
        int count = str.codePointCount(0, 6);

        System.out.println("Number of code points between positions 0 and 6: " + count);
    }
}
