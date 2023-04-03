package abc165.b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final long x = sc.nextLong();

        long money = 100;
        for (long i = 1; i < 1000000000000000000l; i++) {
            money += money / 100;
            if (money >= x) {
                System.out.println(i);
                break;
            }
        }

        sc.close();
    }
}