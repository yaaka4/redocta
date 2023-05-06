package abc220.b;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var k = sc.nextLong();
        final var aArray = Arrays.stream(sc.next()
                        .split(""))
                .mapToLong(Long::valueOf)
                .toArray();
        final var bArray = Arrays.stream(sc.next()
                        .split(""))
                .mapToLong(Long::valueOf)
                .toArray();
        long a = 0;
        for (int i = aArray.length - 1; i >= 0; i--) {
            a += aArray[aArray.length - 1 - i] * Math.pow(k, i);
        }
        long b = 0;
        for (int i = bArray.length - 1; i >= 0; i--) {
            b += bArray[bArray.length - 1 - i] * Math.pow(k, i);
        }
        final long result = a * b;

        System.out.println(result);

        sc.close();
    }
}