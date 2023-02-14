package abc087.b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var a = sc.nextInt();
        final var b = sc.nextInt();
        final var c = sc.nextInt();
        final var x = sc.nextInt();

        var count = 0;
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= b; j++) {
                for (int k = 0; k <= c; k++) {
                    final var amount = 500 * i + 100 * j + 50 * k;
                    if (x == amount) {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);

        sc.close();
    }
}
