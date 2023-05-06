package abc130.b;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var n = sc.nextInt();
        final var x = sc.nextInt();
        final var lList = IntStream.range(0, n)
                .mapToObj(i -> sc.nextInt())
                .toList();
        sc.close();

        int count = 1;
        int totalDistance = 0;
        for (var l : lList) {
            totalDistance += l;
            if (totalDistance > x) {
                break;
            }
            count++;
        }

        final var result = count;
        System.out.println(result);
    }
}