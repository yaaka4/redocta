package abc066.b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        var str = sc.next();

        for (int i = 2; i < str.length(); ) {
            str = str.substring(0, str.length() - i);
            if (isGuuStr(str)) {
                break;
            }
        }

        System.out.println(str.length());

        sc.close();
    }

    private static boolean isGuuStr(String str) {
        return str.substring(0, str.length() / 2)
                .equals(str.substring(str.length() / 2));
    }
}
