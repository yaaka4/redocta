package abc294.a;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var n = sc.nextInt();
        final var result = IntStream.range(0, n)
                .map(i -> sc.nextInt())
                .filter(a -> a % 2 == 0)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" "));

        System.out.println(result);

        sc.close();
    }
}