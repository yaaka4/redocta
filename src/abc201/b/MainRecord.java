package abc201.b;

import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.IntStream;

public class MainRecord {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var n = sc.nextInt();
        final var mountains = IntStream.range(0, n)
                .mapToObj(i -> new Mountain2(sc.next(), sc.nextInt()))
                .sorted(Comparator.comparing(Mountain2::height)
                        .reversed())
                .toList();

        sc.close();

        System.out.println(mountains.get(1)
                .name());
    }
}

record Mountain2(String name, int height) {
}
