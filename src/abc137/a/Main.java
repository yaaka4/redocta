package abc137.a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final var a = sc.nextInt();
        final var b = sc.nextInt();
        var max = Math.max(a + b, a - b);
        max = Math.max(max, a * b);
        System.out.println(max);
    }
}
