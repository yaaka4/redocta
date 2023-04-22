package abc299.c;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        sc.nextInt();
        final var s = sc.next()
                .split("");
        final var barFlg = Arrays.asList(s)
                .contains("-");
        boolean startFlg = true;
        boolean maruFlg = false;
        int count = 0;
        int maxCount = -1;
        for (int i = 0; i < s.length; i++) {
            var str = s[i];
            if (startFlg && str.equals("o") && !maruFlg) {
                count++;
                maruFlg = true;
                startFlg = false;
            } else if (!startFlg && str.equals("o") && i == s.length - 1 && barFlg) {
                count++;
                maxCount = Math.max(maxCount, count);
            } else if (startFlg && str.equals("-") && !maruFlg) {
                maruFlg = false;
                startFlg = false;
            } else if (!startFlg && str.equals("o") && maruFlg) {
                count++;
            } else if (!startFlg && str.equals("-") && maruFlg) {
                maxCount = Math.max(maxCount, count);
                maruFlg = false;
                startFlg = true;
                count = 0;
            } else if (!startFlg && str.equals("o") && !maruFlg) {
                count++;
                maruFlg = true;
            } else if (!startFlg && str.equals("-") && !maruFlg) {
                maruFlg = false;
                startFlg = true;
                count = 0;
            }
        }

        System.out.println(maxCount);

        sc.close();
    }
}