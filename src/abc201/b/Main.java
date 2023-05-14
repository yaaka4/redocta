package abc201.b;

import java.util.Comparator;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var n = sc.nextInt();
        final var mountains = IntStream.range(0, n)
                .mapToObj(i -> new Mountain(sc.next(), sc.nextInt()))
                .sorted(Comparator.comparing(Mountain::height)
                        .reversed())
                .collect(Collectors.toList());

        sc.close();

        System.out.println(mountains.get(1)
                .name());
    }
}

final class Mountain {
    private final String name;
    private final int height;

    Mountain(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String name() {
        return name;
    }

    public int height() {
        return height;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Mountain) obj;
        return Objects.equals(this.name, that.name) &&
                this.height == that.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, height);
    }

    @Override
    public String toString() {
        return "Mountain[" +
                "name=" + name + ", " +
                "height=" + height + ']';
    }

}
