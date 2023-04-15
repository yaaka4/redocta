package abc298.a;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        sc.nextInt();
        final var sArray = sc.next()
                .split("");
        var result = true;
        final var goodCount = Arrays.stream(sArray)
                .filter(s -> s.equals("o"))
                .count();
        final var ngCount = Arrays.stream(sArray)
                .filter(s -> s.equals("x"))
                .count();
        if (ngCount > 0 || goodCount < 1) {
            result = false;
        }

        System.out.println(result ? "Yes" : "No");

        sc.close();
    }
}