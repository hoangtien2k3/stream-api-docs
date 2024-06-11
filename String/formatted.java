package String;

// String formatted(Object... args)
public class formatted {
    public static void main(String[] args) {
        String name = "Alice";
        int age = 30;
        double height = 1.65;

        // Sử dụng phương thức formatted() để tạo chuỗi định dạng
        String formattedString = "Name: %s, Age: %d, Height: %.2f meters".formatted(name, age, height);
        System.out.println("Formatted string: " + formattedString);
    }
}
