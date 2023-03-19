package abc294.b;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var h = sc.nextInt();
        final var w = sc.nextInt();

        IntStream.range(0, h)
                .mapToObj(i ->
                        IntStream.range(0, w)
                                .map(j -> sc.nextInt())
                                .mapToObj(c -> c != 0 ? (char) (c + 64) : '.')
                                .map(String::valueOf)
                                .collect(Collectors.joining())
                )
                .forEach(System.out::println);

        sc.close();
    }
}