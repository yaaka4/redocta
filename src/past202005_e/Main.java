package past202005_e;

import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var n = sc.nextInt();
        final var m = sc.nextInt();
        final var q = sc.nextInt();
        Map<Integer, List<Integer>> graph = new HashMap<>();
        IntStream.range(0, m)
                .forEach(i -> {
                    // 無向グラフの生成
                    int u = sc.nextInt();
                    int v = sc.nextInt();
                    if (graph.containsKey(u)) {
                        graph.get(u)
                                .add(v);
                    } else {
                        List<Integer> list = new ArrayList<>();
                        list.add(v);
                        graph.put(u, list);
                    }
                    if (graph.containsKey(v)) {
                        graph.get(v)
                                .add(u);
                    } else {
                        List<Integer> list = new ArrayList<>();
                        list.add(u);
                        graph.put(v, list);
                    }
                });
        long[] base = IntStream.range(0, n)
                .mapToObj(i -> sc.nextInt())
                .mapToLong(c -> c)
                .toArray();

        for (int i = 0; i < q; i++) {
            if (sc.nextInt() == 1) {
                int x = sc.nextInt();
                System.out.println(base[x - 1]);
                sprinkler(base, x, graph);
            } else {
                int x = sc.nextInt();
                int y = sc.nextInt();
                System.out.println(base[x - 1]);
                base[x - 1] = y;
            }
        }

        sc.close();
    }

    private static void sprinkler(long[] base, int x, Map<Integer, List<Integer>> graph) {
        if (!graph.containsKey(x)) {
            return;
        }
        for (int i = 0; i < graph.get(x)
                .size(); i++) {
            base[graph.get(x)
                    .get(i) - 1] = base[x - 1];
        }
    }
}