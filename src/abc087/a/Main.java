package abc087.a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var x = sc.nextInt();
        final var a = sc.nextInt();
        final var b = sc.nextInt();

        final var result = (x - a) % b;

        System.out.println(result);

        sc.close();
    }
}