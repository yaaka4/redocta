package abc128.a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var a = sc.nextInt();
        final var p = sc.nextInt();

        final var result = (a * 3 + p) / 2;

        System.out.println(result);

        sc.close();
    }
}