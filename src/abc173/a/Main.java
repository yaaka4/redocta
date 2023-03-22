package abc173.a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var n = sc.nextInt();

        final var result = Math.ceil(n / 1000.0) * 1000 - n;

        System.out.println((int) result);

        sc.close();
    }
}