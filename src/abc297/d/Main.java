package abc297.d;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        var a = sc.nextLong();
        var b = sc.nextLong();
        var result = 0L;

        while (a != b) {
            result++;
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }

        System.out.println(result);

        sc.close();
    }
}