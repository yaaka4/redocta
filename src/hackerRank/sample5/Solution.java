package hackerRank.sample5;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        System.out.print(String.format("%-15s", sc.next()));
        System.out.println(String.format("%03d", sc.nextInt()));
        System.out.print(String.format("%-15s", sc.next()));
        System.out.println(String.format("%03d", sc.nextInt()));
        System.out.print(String.format("%-15s", sc.next()));
        System.out.println(String.format("%03d", sc.nextInt()));
        System.out.println("================================");
        sc.close();
    }
}