package abc122.c;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var n = sc.nextInt();
        final var q = sc.nextInt();
        final var s = sc.next();
        final var sArray = s.split("");

        int[] countArray = new int[n];
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                countArray[i] = 0;
            } else if (sArray[i - 1].equals("A") && sArray[i].equals("C")) {
                countArray[i] = 1;
            } else {
                countArray[i] = 0;
            }
        }

        // 累積和
        int[] ruiseki = new int[n];
        for (int i = 0; i < countArray.length; i++) {
            if (i == 0) {
                ruiseki[i] = countArray[i];
            } else {
                ruiseki[i] = ruiseki[i - 1] + countArray[i];
            }
        }

        IntStream.range(0, q)
                .forEach(i -> {
                    final var l = sc.nextInt();
                    final var r = sc.nextInt();
                    // 累積和から[l, r)=S[r] - S[l + 1]
                    final var count = ruiseki[r - 1] - ruiseki[l - 1];
                    System.out.println(count);
                });

        sc.close();
    }
}