package abc289.a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var str = sc.next();
        final var result = str.replaceAll("0", "2")
                .replaceAll("1", "0")
                .replaceAll("2", "1");

        System.out.println(result);

        sc.close();
    }
}
