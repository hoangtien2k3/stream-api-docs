package String;

// để so sánh chuỗi hiện tại với một đối tượng CharSequence khác
// Nó trả về true nếu chuỗi hiện tại có cùng nội dung với đối tượng CharSequence được chỉ định, ngược lại trả về false.
// boolean contentEquals(CharSequence cs)
// boolean contentEquals(StringBuffer sb)
public class contentEquals {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "World";

        StringBuilder stringBuilder = new StringBuilder("Hello");

        // So sánh str1 với str2
        boolean result1 = str1.contentEquals(str2);
        System.out.println("str1 content equals str2: " + result1);

        // So sánh str1 với str3
        boolean result2 = str1.contentEquals(str3);
        System.out.println("str1 content equals str3: " + result2);

        // So sánh str1 với stringBuilder
        boolean result3 = str1.contentEquals(stringBuilder);
        System.out.println("str1 content equals stringBuilder: " + result3);




        // VD2:
        String str = "Hello";
        StringBuffer stringBuffer1 = new StringBuffer("Hello");
        StringBuffer stringBuffer2 = new StringBuffer("World");

        // So sánh str với stringBuffer1
        boolean result5 = str.contentEquals(stringBuffer1);
        System.out.println("str content equals stringBuffer1: " + result5);

        // So sánh str với stringBuffer2
        boolean result6 = str.contentEquals(stringBuffer2);
        System.out.println("str content equals stringBuffer2: " + result6);
    }
}
