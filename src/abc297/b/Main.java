package abc297.b;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var sList = Arrays.stream(sc.next()
                        .split(""))
                .collect(Collectors.toList());
        var result = "No";

        final var firstB = sList.indexOf("B");
        final var lastB = sList.lastIndexOf("B");
        final var firstR = sList.indexOf("R");
        final var lastR = sList.lastIndexOf("R");
        final var firstK = sList.indexOf("K");

        if ((firstB % 2 == 0 && lastB % 2 != 0) || (firstB % 2 != 0 && lastB % 2 == 0)) {
            if (firstR < firstK && firstK < lastR) {
                result = "Yes";
            }

        }

        System.out.println(result);

        sc.close();
    }
}