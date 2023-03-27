package abc162.b;

import java.util.Scanner;
import java.util.stream.LongStream;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var n = sc.nextLong();

        final var result = LongStream.rangeClosed(1, n)
                .filter(i -> i % 3 != 0 && i % 5 != 0)
                .sum();

        System.out.println(result);

        sc.close();
    }
}