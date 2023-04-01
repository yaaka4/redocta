package abc296.c;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var n = sc.nextLong();
        final var x = sc.nextLong();
        final var aList = LongStream.range(0, n)
                .mapToObj(l -> sc.nextLong())
                .collect(Collectors.toSet());

        String result = "No";
        for (long l : aList) {
            if (aList.contains(l + x)) {
                result = "Yes";
                break;
            }
        }

        System.out.println(result);

        sc.close();
    }
}