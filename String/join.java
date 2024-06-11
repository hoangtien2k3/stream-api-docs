package String;

// để nối các phần tử của một mảng hoặc một Iterable thành một chuỗi
// để nối các phần tử của một mảng hoặc danh sách thành một chuỗi, với một chuỗi phân cách được chỉ định.
// static String join(CharSequence delimiter, CharSequence... elements)
// static String join(CharSequence delimiter, Iterable<? extends CharSequence> elements)

public class join {
    public static void main(String[] args) {
        /**
         * Để nối các phần tử của một mảng hoặc danh sách thành một chuỗi, với một chuỗi phân cách được chỉ định.
         * **/
        String fruit1 = "Apple";
        String fruit2 = "Banana";
        String fruit3 = "Orange";
        // Nối các phần tử của danh sách fruits thành một chuỗi, sử dụng dấu phẩy làm ngăn cách
        String result = String.join(", ", fruit1, fruit2, fruit3);
        System.out.println(result); // In ra chuỗi kết quả


        // VD2:
        String[] fruits = {"Apple", "Banana", "Orange"}; // String là lớp triển khai từ `CharSequence`
        // Nối các phần tử của mảng fruits thành một chuỗi, sử dụng dấu phẩy làm ngăn cách
        String result1 = String.join(", ", fruits);
        System.out.println(result1); // In ra chuỗi kết quả

    }
}
