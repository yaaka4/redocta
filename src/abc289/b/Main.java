package abc289.b;

import java.util.Scanner;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var n = sc.nextInt();
        final var m = sc.nextInt();
        final var rList = IntStream.range(0, m)
                .map(i -> sc.nextInt())
                .mapToObj(Integer::valueOf)
                .collect(Collectors.toUnmodifiableList());

        var result = new StringJoiner(" ");
        var count = 0;
        for (var i = 1; i <= n; i++) {
            if (rList.contains(i)) {
                count++;
                continue;
            } else {
                for (var j = i; count >= 0; j--) {
                    result.add(String.valueOf(j));
                    count--;
                }
                count = 0;
            }
        }

        System.out.println(result);

        sc.close();
    }
}
