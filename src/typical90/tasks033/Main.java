package typical90.tasks033;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var h = sc.nextInt();
        final var w = sc.nextInt();

        final var result = h == 1 || w == 1 ? h * w : Math.ceil((double) h / 2) * Math.ceil((double) w / 2);

        System.out.println((int) result);

        sc.close();
    }
}