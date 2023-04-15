package abc093.b;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var a = sc.nextInt();
        final var b = sc.nextInt();
        final var k = sc.nextInt();

        IntStream.rangeClosed(a, b)
                .filter(i -> i < a + k || i > b - k)
                .sorted()
                .forEach(System.out::println);

        sc.close();
    }
}