package abc290.c;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var n = sc.nextInt();
        final var k = sc.nextInt();
        final var aArray = IntStream.range(0, n)
                .mapToObj(i -> sc.nextLong())
                .sorted()
                .distinct()
                .collect(Collectors.toUnmodifiableList());

        long result = 0;
        int kCount = 0;
        for (long l : aArray) {
            kCount++;
            if (l == result && kCount <= k) {
                result++;
                continue;
            } else {
                break;
            }
        }

        System.out.println(result);

        sc.close();
    }
}
