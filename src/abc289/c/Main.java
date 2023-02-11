package abc289.c;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var n = sc.nextInt();
        final var m = sc.nextInt();

        var allList = new ArrayList<List<Integer>>();
        for (var i = 0; i < m; i++) {
            final var c = sc.nextInt();
            final var cList = IntStream.range(0, c)
                    .mapToObj(j -> sc.nextInt())
                    .collect(Collectors.toUnmodifiableList());
            allList.add(cList);
        }

        var resultCount = 0;
        for (var i = 0; i < allList.size(); i++) {
            var tmpList = new ArrayList<Integer>();
            tmpList.addAll(allList.get(i));
            if (checkList(tmpList, n)) {
                resultCount++;
            }
            for (var k = 0; k < allList.size(); k++) {
                tmpList = new ArrayList<Integer>();
                tmpList.addAll(allList.get(i));
                for (var j = i + k + 1; j < allList.size(); j++) {
                    tmpList.addAll(allList.get(j));
                    if (checkList(tmpList, n)) {
                        resultCount++;
                    }
                }
            }
        }

        System.out.println(resultCount);

        sc.close();
    }

    private static boolean checkList(ArrayList<Integer> tmpList, int n) {
        for (var i = 1; i <= n; i++) {
            if (!tmpList.contains(i)) {
                return false;
            }
        }
        return true;
    }
}
