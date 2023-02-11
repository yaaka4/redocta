package abc165.a;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var k = sc.nextInt();
        final var a = sc.nextInt();
        final var b = sc.nextInt();

        final var resultList = IntStream.rangeClosed(a, b)
                .filter(d -> d % k == 0)
                .mapToObj(Integer::valueOf)
                .collect(Collectors.toUnmodifiableList());

        System.out.println(resultList.isEmpty() ? "NG" : "OK");

        sc.close();
    }
}
