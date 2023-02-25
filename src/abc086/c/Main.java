package abc086.c;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var n = sc.nextInt();
        var result = "Yes";
        var nowX = 0;
        var nowY = 0;
        var nowT = 0;
        for (int i = 0; i < n; i++) {
            final var t = sc.nextInt();
            final var x = sc.nextInt();
            final var y = sc.nextInt();

            if (t - nowT < Math.abs(x - nowX) || t - nowT - Math.abs(x - nowX) < Math.abs(y - nowY)) {
                result = "No";
                break;
            } else if ((t - nowT - (Math.abs(x - nowX) + Math.abs(y - nowY))) % 2 != 0) {
                result = "No";
                break;
                // パリティが一致するか確認する
                // if (T % 2 == (X + Y) % 2)
            }
            nowX = x;
            nowY = y;
            nowT = t;
        }

        System.out.println(result);

        sc.close();
    }
}