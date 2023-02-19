package abc290.a;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var n = sc.nextInt();
        final var m = sc.nextInt();
        final var haiten = IntStream.range(0, n)
                .map(i -> sc.nextInt())
                .toArray();
        final var sunuke = IntStream.range(0, m)
                .map(i -> sc.nextInt())
                .toArray();

        var total = 0;
        for (int i = 0; i < m; i++) {
            total += haiten[sunuke[i] - 1];
        }

        System.out.println(total);

        sc.close();
    }
}
