package abc295.a;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var n = sc.nextInt();
        final var resultCount = IntStream.range(0, n)
                .mapToObj(i -> sc.next())
                .filter(s -> s.equals("and") || s.equals("not") || s.equals("that") || s.equals("the") || s.equals("you"))
                .count();

        System.out.println(resultCount > 0 ? "Yes" : "No");

        sc.close();
    }
}