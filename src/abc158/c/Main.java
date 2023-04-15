package abc158.c;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var a = sc.nextInt();
        final var b = sc.nextInt();

        final var array = IntStream.rangeClosed(1, 1000)
                .filter(i -> Math.floor(i * 0.08) == a && Math.floor(i * 0.1) == b)
                .sorted()
                .toArray();

        System.out.println(array.length == 0 ? -1 : array[0]);

        sc.close();
    }
}