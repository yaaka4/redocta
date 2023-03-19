package abc127.a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var a = sc.nextInt();
        final var b = sc.nextInt();

        final int result;
        if (a >= 13) {
            result = b;
        } else if (a >= 6) {
            result = b / 2;
        } else {
            result = 0;
        }

        System.out.println(result);

        sc.close();
    }
}