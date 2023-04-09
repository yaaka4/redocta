package abc297.c;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var h = sc.nextInt();
        sc.nextInt();

        final var sList = IntStream.range(0, h)
                .mapToObj(i -> sc.next()
                        .split(""))
                .collect(Collectors.toList());

        for (String[] array : sList) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < array.length; i++) {
                if ((i + 1) < array.length && array[i].equals("T") && array[i + 1].equals("T")) {
                    sb.append("PC");
                    i++;
                } else {
                    sb.append(array[i]);
                }
            }
            System.out.println(sb);
        }

        sc.close();
    }
}