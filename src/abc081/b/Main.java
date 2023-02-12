package abc081.b;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var n = sc.nextInt();
        var numList = IntStream.range(0, n)
                .mapToObj(i -> sc.nextInt())
                .collect(Collectors.toList());

        var count = 0;
        while (numList.stream()
                .allMatch(num -> num % 2 == 0)) {
            numList = numList.stream()
                    .map(num -> num / 2)
                    .collect(Collectors.toList());
            count++;
        }

        System.out.println(count);

        sc.close();
    }
}
