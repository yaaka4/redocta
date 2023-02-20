package abc144.b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var n = sc.nextInt();
        var result = "No";
        for (int i = 1; i <= 9; i++) {
            if ((n / i) < 10 && (n % i) == 0) {
                result = "Yes";
                break;
            }
        }

        System.out.println(result);

        sc.close();
    }
}
