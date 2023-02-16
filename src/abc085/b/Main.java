package abc085.b;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var n = sc.nextInt();
        // バケット度数分布
        int[] bucket = new int[100];
        IntStream.range(0, n)
                .map(i -> sc.nextInt())
                .forEach(i -> bucket[i - 1]++);

        final var result = Arrays.stream(bucket)
                .filter(i -> i > 0)
                .count();

        System.out.println(result);

        sc.close();
    }
}
