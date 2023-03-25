package abc295.b;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var r = sc.nextInt();
        final var c = sc.nextInt();

        final var initMap = IntStream.range(0, r)
                .mapToObj(i -> Arrays.stream(sc.next()
                                .split(""))
                        .collect(Collectors.toList()))
                .collect(Collectors.toList());

        List<List<String>> resultMap = new ArrayList<>();
        for (List<String> strings : initMap) {
            List<String> resultRow = new ArrayList<>(strings);
            resultMap.add(resultRow);
        }

        for (int i = 0; i < initMap.size(); i++) {
            for (int j = 0; j < initMap.get(i)
                    .size(); j++) {
                final var mass = initMap.get(i)
                        .get(j);
                if (!mass.equals(".") && !mass.equals("#")) {
                    final var bom = Integer.parseInt(mass);
                    for (int k = 0; k < initMap.size(); k++) {
                        for (int l = 0; l < initMap.get(k)
                                .size(); l++) {
                            final var distance = Math.abs(i - k) + Math.abs(j - l);
                            if (distance <= bom) {
                                resultMap.get(k)
                                        .set(l, ".");
                            }
                        }
                    }
                }
            }
        }

        resultMap.stream()
                .map(list -> String.join("", list))
                .forEach(System.out::println);

        sc.close();
    }
}