package abc200.b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        var n = sc.nextLong();
        final var k = sc.nextInt();

        for (int i = 0; i < k; i++) {
            if (n % 200 == 0) {
                n = n / 200;
            } else {
                n = Long.parseLong(n + "200");
            }
        }
        System.out.println(n);

        sc.close();
    }
}