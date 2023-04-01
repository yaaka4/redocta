package abc296.d;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var n = sc.nextLong();
        final var m = sc.nextLong();

        long result = -1;
        Loop:
        if (n / 2 * n / 2 < m) {
            for (long i = n / 2; i <= n; i++) {
                if (i * n < m) {
                    continue;
                }
                for (int j = 1; j <= n; j++) {
                    final var x = i * j;
                    if (x >= m) {
                        result = x;
                        break Loop;
                    }
                }
            }
        } else {
            for (long i = 1; i <= n; i++) {
                if (i * n < m) {
                    continue;
                }
                for (int j = 1; j <= n; j++) {
                    final var x = i * j;
                    if (x >= m) {
                        result = x;
                        break Loop;
                    }
                }
            }
        }

        System.out.println(result);

        sc.close();
    }
}