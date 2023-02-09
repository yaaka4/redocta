package tuto.welcome;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        var a = sc.nextInt();
        var b = sc.nextInt();
        var c = sc.nextInt();
        var s = sc.next();
        System.out.println(a+b+c + " " + s);
    }
}
