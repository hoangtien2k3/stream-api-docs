package String;

// Compares this string to the specified object.
// boolean equals(Object anObject)
public class equals {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "World";

        // So sánh str1 với str2
        boolean equals1 = str1.equals(str2);
        System.out.println("str1 equals str2: " + equals1);

        // So sánh str1 với str3
        boolean equals2 = str1.equals(str3);
        System.out.println("str1 equals str3: " + equals2);
    }
}
