package abc088.a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var n = sc.nextInt();
        final var a = sc.nextInt();

        final var result = n % 500 <= a ? "Yes" : "No";

        System.out.println(result);

        sc.close();
    }
}