package abc095.b;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var n = sc.nextInt();
        final var x = sc.nextInt();
        final var mList = IntStream.range(0, n)
                .mapToObj(i -> sc.nextInt())
                .sorted()
                .toList();
        sc.close();

        final var total = mList.stream()
                .mapToInt(m -> m)
                .sum();

        final var result = mList.size() + (x - total) / mList.get(0);
        System.out.println(result);
    }
}