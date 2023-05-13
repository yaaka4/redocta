package hackerRank.m3c.c;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        // 入力情報
        final String subject = sc.nextLine();
        // 点数の入力情報
        List<List<Integer>> scoreList = new ArrayList<>();
        while (sc.hasNextLine()) {
            scoreList.add(Arrays.stream(sc.nextLine()
                            .split(","))
                    .map(Integer::valueOf)
                    .collect(Collectors.toList()));
        }
        sc.close();

        // 科目数
        final int subjectCount = subject.split(",").length;
        // 生徒数
        final int studentCount = scoreList.size();

        // 科目ごとに点数を合計する
        int[] output = new int[subjectCount];
        for (List<Integer> integers : scoreList) {
            for (int j = 0; j < integers
                    .size(); j++) {
                output[j] += integers
                        .get(j);
            }
        }
        // 平均点に計算する
        for (int i = 0; i < output.length; i++) {
            output[i] = (int) Math.round((double) output[i] / (double) studentCount);
        }
        // カンマ区切りに整形
        final String scoreOutput = Arrays.stream(output)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(","));

        // 結果を出力
        System.out.println(subject);
        System.out.println(scoreOutput);
    }
}