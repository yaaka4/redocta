package abc125.a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var a = sc.nextInt();
        final var b = sc.nextInt();
        final var t = sc.nextInt();

        final var result = t / a * b;

        System.out.println(result);

        sc.close();
    }
}