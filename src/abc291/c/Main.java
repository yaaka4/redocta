package abc291.c;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var n = sc.nextInt();
        final var moveArray = sc.next()
                .split("");

        var currentX = 0;
        var currentY = 0;
        var result = "No";
        XY base = new XY(currentX, currentY);
        Set<XY> set = new HashSet<>();
        set.add(base);
        for (String m : moveArray) {
            switch (m) {
                case "R":
                    currentX++;
                    break;
                case "L":
                    currentX--;
                    break;
                case "U":
                    currentY++;
                    break;
                case "D":
                    currentY--;
                    break;
                default:
                    break;
            }
            XY tmp = new XY(currentX, currentY);
            if (set.contains(tmp)) {
                result = "Yes";
                break;
            } else {
                set.add(tmp);
            }
        }

        System.out.println(result);

        sc.close();
    }

    static class XY {
        public int currentX;
        public int currentY;

        public XY(int x, int y) {
            currentX = x;
            currentY = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            XY xy = (XY) o;
            return currentX == xy.currentX && currentY == xy.currentY;
        }

        @Override
        public int hashCode() {
            return Objects.hash(currentX, currentY);
        }
    }
}