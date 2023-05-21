package abc113.b;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var n = sc.nextInt();
        final var t = sc.nextInt();
        final var a = sc.nextInt();
        final var heightList = IntStream.range(0, n)
                .map(i -> sc.nextInt())
                .boxed()
                .toList();
        sc.close();

        final var absList = heightList.stream()
                .map(h -> Math.abs(a - (t - h * 0.006)))
                .toList();

        var result = 0;
        double tempo = 9999999;
        for (int i = 1; i <= absList.size(); i++) {
            var tmp = absList.get(i - 1);
            if (tempo > tmp) {
                result = i;
                tempo = tmp;
            }
        }

        System.out.println(result);
    }
}
