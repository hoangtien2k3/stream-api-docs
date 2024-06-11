package String;

// để so sánh hai chuỗi dựa trên thứ tự từ điển.
// int compareTo(String anotherString)
public class compareTo {
    public static void main(String[] args) {
        String str1 = "apple";
        String str2 = "banana";

        int result = str1.compareTo(str2);

        if (result < 0) {
            System.out.println(str1 + " is less than " + str2);
        } else if (result > 0) {
            System.out.println(str1 + " is greater than " + str2);
        } else {
            System.out.println(str1 + " is equal to " + str2);
        }
    }
}
