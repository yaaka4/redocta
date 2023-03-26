package abc176.a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var n = sc.nextInt();
        final var x = sc.nextInt();
        final var t = sc.nextInt();

        final var result = Math.ceil((double) n / (double) x) * t;

        System.out.println((int) result);

        sc.close();
    }
}