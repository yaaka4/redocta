package abc157.a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var n = sc.nextInt();

        final var result = Math.ceil(n / 2.0);

        System.out.println((int) result);

        sc.close();
    }
}