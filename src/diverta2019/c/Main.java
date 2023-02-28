package diverta2019.c;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var n = sc.nextInt();
        final var sArray = IntStream.range(0, n)
                .mapToObj(i -> sc.next())
                .collect(Collectors.toUnmodifiableList());
        final var bStartCount = sArray.stream()
                .filter(s -> s.startsWith("B"))
                .filter(s -> !s.endsWith("A"))
                .count();
        final var aEndCount = sArray.stream()
                .filter(s -> s.endsWith("A"))
                .filter(s -> !s.startsWith("B"))
                .count();
        final var bStartAEndCount = sArray.stream()
                .filter(s -> s.endsWith("A"))
                .filter(s -> s.startsWith("B"))
                .count();
        final var abCount = sArray.stream()
                .mapToInt(s -> {
                    final var baseCount = s.length();
                    final var otherCount = s.replaceAll("AB", "")
                            .length();
                    return (baseCount - otherCount) / 2;
                })
                .sum();

        final long result;
        if (bStartCount == 0 && aEndCount == 0) {
            result = abCount + Math.max(bStartAEndCount - 1, 0);
        } else {
            result = abCount + bStartAEndCount + Math.min(bStartCount, aEndCount);
        }
        System.out.println(result);

        sc.close();
    }
}