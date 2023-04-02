package abc206.b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var n = sc.nextInt();
        for (int i = 1; i < 100000000; i++) {
            if (i * (i + 1) >= 2 * n) {
                System.out.println(i);
                break;
            }
        }

        sc.close();
    }
}