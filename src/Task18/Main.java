package Task18;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<Integer, String> func = x -> getStr(x);
        System.out.println(func.apply(20));
        System.out.println(func.apply(-20));
        System.out.println(func.apply(0));
    }

    private static String getStr(Integer num) {
        if (num > 0) {
            return "Положительное число";
        } else if (num < 0) {
            return "Отрицательное число";
        } else {
            return "Ноль";
        }
    }
}
