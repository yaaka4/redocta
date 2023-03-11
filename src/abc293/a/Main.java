package abc293.a;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var n = sc.next()
                .split("");
        String[] resultArray = new String[n.length];
        for (int i = 0; i < n.length; i += 2) {
            resultArray[i] = n[i + 1];
            resultArray[i + 1] = n[i];
        }
        final var result = Arrays.stream(resultArray)
                .collect(Collectors.joining());

        System.out.println(result);

        sc.close();
    }
}