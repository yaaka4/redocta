package abc137.c;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var n = sc.nextInt();
        Map<String, Long> strMap = new HashMap<>();
        IntStream.range(0, n)
                .mapToObj(i -> sc.next())
                .map(s -> Arrays.stream(s.split(""))
                        .sorted()
                        .collect(Collectors.joining()))
                .forEach(s -> strMap.put(s, Objects.nonNull(strMap.get(s)) ? strMap.get(s) + 1 : 1));

        final var result = strMap.values()
                .stream()
                .filter(i -> i > 1)
                .mapToLong(Long::valueOf)
                // n個から2個を選ぶ場合の数
                .map(cnt -> cnt * (cnt - 1) / 2)
                .sum();

        System.out.println(result);

        sc.close();
    }
}
