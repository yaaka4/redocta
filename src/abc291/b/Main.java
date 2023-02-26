package abc291.b;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var n = sc.nextInt();
        final var result = IntStream.range(0, 5 * n)
                .map(i -> sc.nextInt())
                .mapToDouble(s -> s)
                .sorted()
                .skip(n)
                .limit((long) 3 * n)
                .average();

        System.out.println(result.orElse(0));

        sc.close();
    }
}