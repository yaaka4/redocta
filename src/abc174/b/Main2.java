package abc174.b;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main2 {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var n = sc.nextInt();
        final var d = sc.nextDouble();
        final var result = IntStream.range(0, n)
                .mapToObj(i -> new Point(sc.nextInt(), sc.nextInt()))
                .filter(r -> r.getDistance() <= d)
                .count();
        sc.close();

        System.out.println(result);
    }
}

record Point(int x, int y) {
    public double getDistance() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
}
