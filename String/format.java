package String;

import java.util.Locale;

// static String format(String format, Object... args)
// static String format(Locale l, String format, Object... args)
public class format {
    public static void main(String[] args) {
        String name = "Alice";
        int age = 30;
        double height = 1.65;

        // Sử dụng phương thức format() để tạo chuỗi định dạng
        String formattedString = String.format("Name: %s, Age: %d, Height: %.2f meters", name, age, height);
        System.out.println("Formatted string: " + formattedString);

        // Sử dụng phương thức format() với Locale để định dạng số theo ngôn ngữ cụ thể
        String formattedWithLocale = String.format(Locale.FRANCE, "Name: %s, Age: %d, Height: %.2f meters", name, age, height);
        System.out.println("Formatted string with locale: " + formattedWithLocale);
    }
}
