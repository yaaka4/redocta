package abc292.c;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var n = sc.nextInt();

        var result = 0;

        for (int i = 1; i < n; i++) {
            // AB = i
            var abCount = i != 1 ? 2 : 0;
            final var sqrI = Math.sqrt(i);
            if (Math.floor(sqrI) == sqrI) {
                abCount++;
            }
            for (int j = 2; j < sqrI; j++) {
                if (i % j == 0) {
                    abCount += 2;
                }
            }
            // CD = N - i
            var cdCount = n - i != 1 ? 2 : 0;
            final var sqrN = Math.sqrt(n - i);
            if (Math.floor(sqrN) == sqrN) {
                cdCount++;
            }
            for (int j = 2; j < sqrN; j++) {
                if ((n - i) % j == 0) {
                    cdCount += 2;
                }
            }
            result += abCount * cdCount;
        }

        System.out.println(result);

        sc.close();
    }
}
