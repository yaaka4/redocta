package abc097.b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var x = sc.nextInt();

        double result = 0;
        for (int i = 1000; i >= 1; i--) {
            for (int j = 10; j >= 2; j--) {
                double tmp = Math.pow(i, j);
                if (tmp <= x) {
                    result = Math.max(result, tmp);
                }
            }
        }

        System.out.println((int) result);

        sc.close();
    }
}