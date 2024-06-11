package String;

// để kiểm tra xem chuỗi có khớp với biểu thức chính quy (regex) đã cho hay không.
// boolean matches(String regex)
public class matches {
    public static void main(String[] args) {
        String str = "Hello123";
        boolean result = str.matches("[a-zA-Z]+\\d+");
        System.out.println(result); // Output: true


        // VD2:
        String name = "hoangtien2k3";
        String newName = "hoangtien2k3*";
        boolean check = name.matches(newName);
        System.out.println(check);
    }
}
