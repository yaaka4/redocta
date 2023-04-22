package abc299.b;

import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var n = sc.nextInt();
        final var t = sc.nextInt();
        final var cArray = IntStream.range(0, n)
                .mapToObj(i -> sc.nextInt())
                .collect(Collectors.toList());
        final var rArray = IntStream.range(0, n)
                .mapToObj(i -> sc.nextInt())
                .collect(Collectors.toList());

        int num = 0;
        int result = 0;
        if (cArray.contains(t)) {
            for (int i = 0; i < n; i++) {
                if (cArray.get(i) == t && num < rArray.get(i)) {
                    num = Math.max(num, rArray.get(i));
                    result = i + 1;
                }
            }
        } else {
            for (int i = 0; i < n; i++) {
                if (Objects.equals(cArray.get(i), cArray.get(0)) && num < rArray.get(i)) {
                    num = Math.max(num, rArray.get(i));
                    result = i + 1;
                }
            }
        }

        System.out.println(result);

        sc.close();
    }
}