package abc298.b;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var n = sc.nextInt();
        final var aList = IntStream.range(0, n)
                .mapToObj(i -> IntStream.range(0, n)
                        .map(j -> sc.nextInt())
                        .toArray())
                .collect(Collectors.toList());
        final var bList = IntStream.range(0, n)
                .mapToObj(i -> IntStream.range(0, n)
                        .map(j -> sc.nextInt())
                        .toArray())
                .collect(Collectors.toList());
        var result = "No";

        LabelA:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (aList.get(i)[j] == 1 && bList.get(i)[j] != 1) {
                    break LabelA;
                }
            }
            if (i == n - 1) {
                result = "Yes";
            }
        }
        LabelB:
        if (result.equals("No")) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (aList.get(i)[j] == 1 && bList.get(n - j - 1)[i] != 1) {
                        break LabelB;
                    }
                }
                if (i == n - 1) {
                    result = "Yes";
                }
            }
        }
        LabelC:
        if (result.equals("No")) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (aList.get(i)[j] == 1 && bList.get(n - i - 1)[n - j - 1] != 1) {
                        break LabelC;
                    }
                }
                if (i == n - 1) {
                    result = "Yes";
                }
            }
        }
        LabelD:
        if (result.equals("No")) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (aList.get(i)[j] == 1 && bList.get(j)[n - j - 1] != 1) {
                        break LabelD;
                    }
                }
                if (i == n - 1) {
                    result = "Yes";
                }
            }
        }

        System.out.println(result);

        sc.close();
    }
}