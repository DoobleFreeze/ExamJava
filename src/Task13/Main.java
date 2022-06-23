package Task13;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<String> isNull = x -> x != null;
        System.out.println(isNull.test(null));
        System.out.println(isNull.test("Hello, world!"));
    }
}
