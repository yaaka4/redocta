package hackerRank.sample6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine()
                .trim());

        IntStream.rangeClosed(1, 10)
                .mapToObj(i -> N + " x " + i + " = " + N * i)
                .forEach(System.out::println);

        bufferedReader.close();
    }
}