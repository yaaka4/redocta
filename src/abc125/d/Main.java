package abc125.d;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var n = sc.nextInt();
        final var aArray = IntStream.range(0, n)
                .map(i -> sc.nextInt())
                .mapToLong(Long::valueOf)
                .toArray();
        final var minusCount = Arrays.stream(aArray)
                .filter(i -> i < 0)
                .count();

        long result = Arrays.stream(aArray)
                .map(Math::abs)
                .sum();
        if (minusCount % 2 != 0) {
            final var min = Arrays.stream(aArray)
                    .map(Math::abs)
                    .min();
            result = result - (2L * min.orElse(0L));
        }

        System.out.println(result);

        sc.close();
    }
}