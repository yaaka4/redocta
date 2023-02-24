package agc024.a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var a = sc.nextLong();
        final var b = sc.nextLong();
        final var c = sc.nextLong();
        final var k = sc.nextLong();
        final long MAX = 1000000000000000000L;

        final long result;
        if (k % 2 == 0) {
            result = a - b;
        } else {
            result = b - a;
        }

        if (Math.abs(result) > MAX) {
            System.out.println("Unfair");
        } else {
            System.out.println(result);
        }

        sc.close();
    }
}