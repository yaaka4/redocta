package abc293.c;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var h = sc.nextInt();
        final var w = sc.nextInt();
        final List<List<Integer>> baseMap = IntStream.range(0, h)
                .mapToObj(i -> IntStream.range(0, w)
                        .mapToObj(j -> sc.nextInt())
                        .collect(Collectors.toList()))
                .collect(Collectors.toList());

        int result = 0;
        Set<Integer> set = new HashSet<>();

        for (int je = w; je > 0; je--) {
            END:
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < je; j++) {
                    final var key = baseMap.get(i)
                            .get(j);
                    if (set.contains(key)) {
                        break END;
                    } else {
                        set.add(key);
                    }
                }
                for (int j = je; j < w; j++) {
                    final var key = baseMap.get(i)
                            .get(j);
                    if (set.contains(key)) {
                        break END;
                    } else {
                        set.add(key);
                    }
                }
            }
            result++;
        }


        System.out.println(result);

        sc.close();
    }
}