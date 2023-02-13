package abc104.b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var str = sc.next();
        var result = "AC";
        if (!str.startsWith("A")) {
            result = "WA";
        }
        final var slice = str.substring(2, str.length() - 1);
        final var cCount = slice.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> c == 'C')
                .count();
        if (cCount != 1) {
            result = "WA";
        }
        final var excludeAc = str.replaceFirst("A", "")
                .replaceFirst("C", "");
        final var isLower = excludeAc.chars()
                .mapToObj(c -> (char) c)
                .allMatch(Character::isLowerCase);
        if (!isLower) {
            result = "WA";
        }

        System.out.println(result);

        sc.close();
    }
}
