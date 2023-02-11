package abc083.b;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var n = sc.nextInt();
        final var a = sc.nextInt();
        final var b = sc.nextInt();
        final var sum = IntStream.rangeClosed(1, n)
                .filter(num -> {
                    final var total = Arrays.stream(String.valueOf(num)
                                    .split(""))
                            .mapToInt(Integer::parseInt)
                            .sum();
                    return a <= total && total <= b;
                })
                .sum();

        System.out.println(sum);

        sc.close();
    }
}
