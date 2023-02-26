package abc291.a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var s = sc.next()
                .chars()
                .mapToObj(i -> (char) i)
                .toArray(Character[]::new);
        for (int i = 0; i < s.length; i++) {
            if (Character.isUpperCase(s[i])) {
                System.out.println(i + 1);
                break;
            }
        }

        sc.close();
    }
}