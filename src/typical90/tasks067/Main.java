package typical90.tasks067;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var n = sc.next();
        final int k = sc.nextInt();
        sc.close();

        // 8進数9進数変換
        String result = n;
        for (int i = 0; i < k; i++) {
            long octa = Long.parseLong(result, 8);
            result = Long.toString(octa, 9)
                    .replaceAll("8", "5");
        }

        System.out.println(result);
    }
}