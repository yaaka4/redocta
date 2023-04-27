package hackerRank.sample2;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        IntStream.range(0, 3)
                .map(i -> sc.nextInt())
                .forEach(System.out::println);

        sc.close();
    }
}