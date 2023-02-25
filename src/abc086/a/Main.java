package abc086.a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 掛算
        System.out.println((sc.nextInt() * sc.nextInt()) % 2 == 0 ? "Even" : "Odd");
    }
}
