package abc068.b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var n = sc.nextInt();
        var maxCount = 0;
        var result = 1;
        for (int i = 1; i <= n; i++) {
            var j = i;
            var count = 0;
            while (j % 2 == 0) {
                count++;
                j = j / 2;
            }
            if (maxCount < count) {
                maxCount = count;
                result = i;
            }
        }

        System.out.println(result);

        sc.close();
    }
}