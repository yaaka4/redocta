package abc118.a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var a = sc.nextInt();
        final var b = sc.nextInt();

        final var result = b % a == 0 ? a + b : b - a;

        System.out.println(result);

        sc.close();
    }
}