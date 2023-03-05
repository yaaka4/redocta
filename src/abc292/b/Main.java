package abc292.b;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var n = sc.nextInt();
        final var q = sc.nextInt();

        int[] card = new int[n];

        IntStream.range(0, q)
                .forEach(i -> {
                    final var event = sc.nextInt();
                    final var player = sc.nextInt();
                    switch (event) {
                        case 1:
                            card[player - 1] += 1;
                            break;
                        case 2:
                            card[player - 1] += 2;
                            break;
                        case 3:
                            System.out.println(card[player - 1] >= 2 ? "Yes" : "No");
                            break;
                        default:
                            break;
                    }
                });

        sc.close();
    }
}