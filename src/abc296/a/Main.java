package abc296.a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        sc.nextInt();
        final var s = sc.next()
                .split("");

        var result = "Yes";
        for (int i = 0; i < s.length; i++) {
            if (i % 2 == 0 && s[0].equals("M")) {
                if (!s[i].equals("M")) {
                    result = "No";
                    break;
                }
            } else if (i % 2 == 0 && s[0].equals("F")) {
                if (!s[i].equals("F")) {
                    result = "No";
                    break;
                }
            } else if (i % 2 != 0 && s[0].equals("M")) {
                if (!s[i].equals("F")) {
                    result = "No";
                    break;
                }
            } else if (i % 2 != 0 && s[0].equals("F")) {
                if (!s[i].equals("M")) {
                    result = "No";
                    break;
                }
            }
        }

        System.out.println(result);

        sc.close();
    }
}