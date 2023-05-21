package abc205.b;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var n = sc.nextInt();
        final var numList = IntStream.range(0, n)
                .map(i -> sc.nextInt())
                .boxed()
                .toList();
        sc.close();

        final var distinctCount = numList.stream()
                .distinct()
                .count();
        final var result = distinctCount == n ? "Yes" : "No";

        System.out.println(result);
    }
}
