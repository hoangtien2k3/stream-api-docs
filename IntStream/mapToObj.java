package IntStream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

// để chuyển đổi mỗi phần tử trong một luồng dữ liệu thành một phần tử mới của kiểu đối tượng (Object)
// <U> Stream<U> mapToObj(IntFunction<? extends U> mapper)
public class mapToObj {
    public static void main(String[] args) {
        IntStream intStream = IntStream.rangeClosed(1, 5);

        // Sử dụng mapToObj để chuyển đổi mỗi số nguyên thành một chuỗi String
        // Kết quả là một Stream<String> chứa các chuỗi đã chuyển đổi
        intStream.mapToObj(n -> "Number " + n)
                .forEach(System.out::println);



        // VD2:
        // Tạo một IntStream chứa các số nguyên từ 18 đến 30
        IntStream ageStream = IntStream.rangeClosed(18, 30);

        // Sử dụng mapToObj để chuyển đổi mỗi số nguyên thành một đối tượng Person
        Stream<Person> personStream = ageStream.mapToObj(age -> new Person("Person " + age, age));

        // In ra các đối tượng Person từ luồng đã chuyển đổi
        personStream.forEach(System.out::println);

    }
}
