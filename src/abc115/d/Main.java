package abc115.d;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var n = sc.nextLong();
        final var x = sc.nextLong();

        final var burger = createBurger(n);
        final var result = burger.chars()
                .limit(x)
                .mapToObj(i -> (char) i)
                .filter(c -> c == 'P')
                .count();

        System.out.println(result);

        sc.close();
    }

    private static String createBurger(long n) {
        var burger = "";
        if (n == 0) {
            burger = String.join("", "P");
            return burger;
        }

        burger = String.join("", "B", createBurger(n - 1), "P", createBurger(n - 1), "B");
        return burger;
    }
}