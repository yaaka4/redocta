package abc208.b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var p = sc.nextInt();
        var coin = 3628800 * 11;

        var count = 0;
        int mod = p;
        for (int i = 11; i > 0; i--) {
            coin = coin / i;
            count += mod / coin;
            mod = mod % coin;
            if (mod == 0) {
                break;
            }
        }

        System.out.println(count);

        sc.close();
    }
}