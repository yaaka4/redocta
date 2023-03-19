package abc294.c;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var n = sc.nextInt();
        final var m = sc.nextInt();
        final var aArray = IntStream.range(0, n)
                .mapToLong(i -> sc.nextLong())
                .toArray();
        final var bArray = IntStream.range(0, m)
                .mapToLong(i -> sc.nextLong())
                .toArray();
        final var abArray = LongStream.concat(Arrays.stream(aArray), Arrays.stream(bArray))
                .sorted()
                .toArray();

        long[] aResultArray = new long[aArray.length];
        int j = 0;
        for (int i = 0; i < abArray.length; i++) {
            if (abArray[i] == aArray[j]) {
                aResultArray[j] = i + 1;
                j++;
            }
            if (j >= aArray.length) {
                break;
            }
        }
        long[] bResultArray = new long[bArray.length];
        j = 0;
        for (int i = 0; i < abArray.length; i++) {
            if (abArray[i] == bArray[j]) {
                bResultArray[j] = i + 1;
                j++;
            }
            if (j >= bArray.length) {
                break;
            }
        }

        final var aResult = Arrays.stream(aResultArray)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" "));
        final var bResult = Arrays.stream(bResultArray)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" "));

        System.out.println(aResult);
        System.out.println(bResult);

        sc.close();
    }
}