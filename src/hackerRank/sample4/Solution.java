package hackerRank.sample4;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var intVal = sc.nextInt();
        final var doubleVal = sc.nextDouble();
        sc.nextLine();
        final var strVal = sc.nextLine();

        System.out.println("String: " + strVal);
        System.out.println("Double: " + doubleVal);
        System.out.println("Int: " + intVal);
        sc.close();
    }
}