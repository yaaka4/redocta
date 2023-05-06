package hackerRank.m3.c;

import java.util.Scanner;
import java.util.StringJoiner;

public class Solution {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        // 入力数値
        final var inputArray = sc.next()
                .split(",");
        StringJoiner output = new StringJoiner(",");
        for (int i = 0; i < inputArray.length; i++) {
            // 配列のインデックスは１ずれているので、偶数番目を除く
            if (i % 2 != 0 || ((i - 1) >= 0 && inputArray[i - 1].equals(inputArray[i]))) {
                output.add(inputArray[i]);
            }
        }
        // 結果を出力
        System.out.println(output);

        sc.close();
    }
}