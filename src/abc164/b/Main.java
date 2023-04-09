package abc164.b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        var a = sc.nextInt();
        final var b = sc.nextInt();
        var c = sc.nextInt();
        final var d = sc.nextInt();
        var isTakTurn = false;

        while (a > 0 && c > 0) {
            isTakTurn = !isTakTurn;
            if (isTakTurn) {
                c -= b;
            } else {
                a -= d;
            }
        }

        System.out.println(isTakTurn ? "Yes" : "No");

        sc.close();
    }
}