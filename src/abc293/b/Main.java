package abc293.b;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var n = sc.nextInt();
        var aArray = IntStream.range(0, n)
                .map(i -> sc.nextInt())
                .toArray();

        for (int i = 0; i < aArray.length; i++) {
            if (aArray[i] == 0) {
                continue;
            }
            aArray[aArray[i] - 1] = 0;
        }

        final var resultCount = Arrays.stream(aArray)
                .filter(i -> i != 0)
                .count();
        System.out.println(resultCount);
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < aArray.length; i++) {
            if (aArray[i] == 0) {
                continue;
            }
            resultList.add(i + 1);
        }
        final var result = resultList.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(" "));
        System.out.println(result);

        sc.close();
    }
}