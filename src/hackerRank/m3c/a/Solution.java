package hackerRank.m3c.a;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        // 入力情報
        StringBuilder str = new StringBuilder(sc.nextLine());
        while (sc.hasNextLine()) {
            str.append(" ")
                    .append(sc.nextLine());
        }
        // デバッグで標準入力を終了するのはctrl＋D
        sc.close();

        // アルファベット大文字・数字から始まる単語の種類をカウント
        final long result = Arrays.stream(str.toString()
                        .split(" "))
                .filter(s -> s.matches("[A-Z].*") || s.matches("[0-9].*"))
                .distinct()
                .count();

        // 結果を出力
        System.out.println(result);

    }
}