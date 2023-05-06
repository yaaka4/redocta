package hackerRank.m3.a;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        // 入力情報
        final var subject = sc.nextLine();
        final var subjectCount = subject.split(",").length;
        List<List<Integer>> testRsults = new ArrayList<>();
        while (sc.hasNextLine()) {
            testRsults.add(Arrays.stream(sc.nextLine()
                            .split(","))
                    .map(Integer::valueOf)
                    .toList());
        }
        final var studentCount = testRsults.size();

        StringJoiner output = new StringJoiner(",");
        //　平均点を計算


        // 結果を出力
        System.out.println("");

        // デバッグで標準入力を終了するのはctrl＋D
        sc.close();
    }
}