package abc88.b;

import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var n = sc.nextInt();
        final var cardList = IntStream.range(0, n)
                .mapToObj(i -> sc.nextInt())
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        var aliceSum = 0;
        var bobSum = 0;
        for (var i = 0; i < cardList.size(); i++) {
            if (i % 2 == 0) {
                aliceSum += cardList.get(i);
            } else {
                bobSum += cardList.get(i);
            }
        }

        System.out.println(aliceSum - bobSum);

        sc.close();
    }
}
