package abc295.c;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var n = sc.nextInt();
        final var socks = IntStream.range(0, n)
                .mapToObj(i -> sc.nextLong())
                .sorted()
                .collect(Collectors.toList());

        var result = 0;
        for (int i = 0; i < socks.size() - 1; i++) {
            if (socks.get(i)
                    .equals(socks.get(i + 1))) {
                result++;
                i++;
            }
        }

        System.out.println(result);

        sc.close();
    }
}