package abc064.a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var r = sc.nextInt();
        final var g = sc.nextInt();
        final var b = sc.nextInt();

        final var result = (100 * r + 10 * g + b) % 4 == 0 ? "YES" : "NO";

        System.out.println(result);

        sc.close();
    }
}