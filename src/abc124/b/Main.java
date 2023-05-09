package abc124.b;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var n = sc.nextInt();
        final var hList = IntStream.range(0, n)
                .map(i -> sc.nextInt())
                .boxed()
                .toList();
        sc.close();

        var result = 1;

        OUTER:
        for (int i = 1; i < hList.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (hList.get(i) < hList.get(j)) {
                    continue OUTER;
                }
            }
            result++;
        }

        System.out.println(result);
    }
}