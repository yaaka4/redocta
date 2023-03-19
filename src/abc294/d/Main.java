package abc294.d;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        sc.nextInt();
        final var q = sc.nextInt();

        Set<Integer> calledSet = new TreeSet<>();
        var num = 0;
        for (int i = 0; i < q; i++) {
            final var e = sc.nextInt();
            if (e == 1) {
                calledSet.add(++num);
            } else if (e == 2) {
                calledSet.remove(sc.nextInt());
            } else {
                System.out.println(calledSet.iterator()
                        .next());
            }
        }

        sc.close();
    }
}