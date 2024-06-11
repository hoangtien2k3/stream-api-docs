package String;

import java.util.Optional;

// hỗ trợ tính toán hằng số trong các loại dữ liệu.
// Optional<String> describeConstable()
public class describeConstable {
    public static void main(String[] args) {
        // Nếu đối tượng này có thể được mô tả bằng một giá trị hằng số,
        // phương thức sẽ trả về một Optional chứa giá trị của hằng số đó.
        Optional<String> description = "Hello".describeConstable();

        if(description.isPresent()) {
            System.out.println("Constant value: " + description.get());
        } else {
            System.out.println("Not a constant value.");
        }
    }
}
