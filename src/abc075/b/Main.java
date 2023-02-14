package abc075.b;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        final var BOM = "#";

        final Scanner sc = new Scanner(System.in);

        final var h = sc.nextInt();
        final var w = sc.nextInt();

        final var mass = IntStream.range(0, h)
                .mapToObj(i -> sc.next()
                        .split(""))
                .collect(Collectors.toList());

        List<String[]> resultMass = new ArrayList<>();
        for (int i = 0; i < h; i++) {
            String[] resultArray = new String[w];
            for (int j = 0; j < w; j++) {
                final var target = mass.get(i)[j];
                if (target.equals(BOM)) {
                    resultArray[j] = BOM;

                    continue;
                }
                var count = 0;
                if (i != 0 && mass.get(i - 1)[j].equals(BOM)) {
                    count++;
                }
                if (i != 0 && j != w - 1 && mass.get(i - 1)[j + 1].equals(BOM)) {
                    count++;
                }
                if (j != w - 1 && mass.get(i)[j + 1].equals(BOM)) {
                    count++;
                }
                if (i != h - 1 && j != w - 1 && mass.get(i + 1)[j + 1].equals(BOM)) {
                    count++;
                }
                if (i != h - 1 && mass.get(i + 1)[j].equals(BOM)) {
                    count++;
                }
                if (i != h - 1 && j != 0 && mass.get(i + 1)[j - 1].equals(BOM)) {
                    count++;
                }
                if (j != 0 && mass.get(i)[j - 1].equals(BOM)) {
                    count++;
                }
                if (i != 0 && j != 0 && mass.get(i - 1)[j - 1].equals(BOM)) {
                    count++;
                }

                resultArray[j] = String.valueOf(count);
            }
            resultMass.add(i, resultArray);
        }

        resultMass.stream()
                .map(array -> String.join("", array))
                .forEach(System.out::println);

        sc.close();
    }
}
