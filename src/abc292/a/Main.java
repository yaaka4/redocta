package abc292.a;

import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var n = sc.next();

        final var result = n.chars()
                .mapToObj(i -> (char) i)
                .map(Character::toUpperCase)
                .map(String::valueOf)
                .collect(Collectors.joining());

        System.out.println(result);

        sc.close();
    }
}