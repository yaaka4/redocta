package abc295.d;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var s = sc.next();
        var result = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j += 2) {
                final var subStr = Arrays.stream(s.substring(i, j + 1)
                                .split(""))
                        .sorted()
                        .toArray(String[]::new);
                StringBuilder pre = new StringBuilder();
                StringBuilder nex = new StringBuilder();
                for (int k = 0; k < subStr.length; k++) {
                    if (k % 2 == 0) {
                        pre.append(subStr[k]);
                    } else {
                        nex.append(subStr[k]);
                    }
                }

                if (pre.toString()
                        .equals(nex.toString())) {
                    result++;
                }
            }
        }

        System.out.println(result);

        sc.close();
    }
}