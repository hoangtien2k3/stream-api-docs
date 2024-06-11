package String;

// để thêm tiền tố khoảng trắng vào mỗi dòng trong một chuỗi.
// String indent(int n)
public class indent {
    public static void main(String[] args) {
        String text = "Hello\nWorld\nJava";

        // Thêm tiền tố khoảng trắng (2 khoảng trắng) vào mỗi dòng
        String indentedText = text.indent(2);

        System.out.println(indentedText);
    }
}
