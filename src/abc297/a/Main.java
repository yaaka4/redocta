package abc297.a;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var n = sc.nextInt();
        final var d = sc.nextInt();
        final var tList = IntStream.range(0, n)
                .mapToObj(i -> sc.nextInt())
                .collect(Collectors.toList());

        int result = -1;
        for (int i = 0; i < tList.size() - 1; i++) {
            if ((tList.get(i + 1) - tList.get(i) <= d)) {
                result = tList.get(i + 1);
                break;
            }
        }

        System.out.println(result);

        sc.close();
    }
}