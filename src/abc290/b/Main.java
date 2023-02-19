package abc290.b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        sc.nextInt();
        final var k = sc.nextInt();
        final var wishArray = sc.next()
                .split("");

        StringBuilder result = new StringBuilder();
        var count = 0;
        for (var wish : wishArray) {
            if (wish.equals("o") && count < k) {
                result.append("o");
                count++;
            } else {
                result.append("x");
            }
        }

        System.out.println(result);

        sc.close();
    }
}
