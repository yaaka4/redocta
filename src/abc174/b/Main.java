package abc174.b;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var n = sc.nextInt();
        final var d = sc.nextDouble();
        final var count = IntStream.range(0, n)
                .mapToObj(i -> Math.sqrt(Math.pow(sc.nextInt(), 2) + Math.pow(sc.nextInt(), 2)))
                .filter(dis -> dis <= d)
                .count();
        sc.close();

        final var result = count;
        System.out.println(result);
    }
}
