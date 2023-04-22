package abc299.a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        sc.nextInt();
        final var s = sc.next();
        final var first = s.indexOf("|");
        final var aster = s.indexOf("*");
        final var last = s.lastIndexOf("|");
        final var result = (first < aster && aster < last) ? "in" : "out";

        System.out.println(result);

        sc.close();
    }
}