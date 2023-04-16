package abc090.b;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var a = sc.nextInt();
        final var b = sc.nextInt();

        final var result = IntStream.rangeClosed(a, b)
                .mapToObj(String::valueOf)
                .map(s -> s.split(""))
                .filter(array -> array[0].equals(array[4]) && array[1].equals(array[3]))
                .count();

        System.out.println(result);

        sc.close();
    }
}