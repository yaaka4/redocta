package abc085.c;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var n = sc.nextInt();
        final var y = sc.nextInt();

        var result = "-1 -1 -1";
        Loop:
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                // 3つの変数を動かすのではなく２つに絞る
                final var amount = 10000 * i + 5000 * j + 1000 * (n - i - j);
                if (y == amount) {
                    result = i + " " + j + " " + (n - i - j);
                    break Loop;
                }
            }
        }

        System.out.println(result);

        sc.close();
    }
}
