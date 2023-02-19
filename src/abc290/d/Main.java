package abc290.d;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var t = sc.nextInt();
        final var longArrayList = IntStream.range(0, t)
                .mapToObj(i -> new long[]{sc.nextLong(), sc.nextLong(), sc.nextLong()})
                .collect(Collectors.toUnmodifiableList());

        var result = longArrayList.stream()
                .map(array -> draw(array))
                .map(String::valueOf)
                .collect(Collectors.joining());

        System.out.println(result);

        sc.close();
    }

    private static long draw(long[] array) {
        Set<Long> mass = new HashSet<>();
        mass.add(0l);
        long k = 0;
        for (long i = 0; i < array[0]; ) {
            long x = (i + array[1]) % array[0];
            while (true) {
                if (mass.contains(x)) {
                    x = (x + 1) % array[0];
                } else if (mass.size() == array[0]) {
                    break;
                } else {
                    break;
                }
            }
            k++;
            mass.add(x);
            if (k == array[2]) {
                return x;
            }
        }
        return 0;
    }
}
