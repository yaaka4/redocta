package abc153.serval;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var hitPoint = (double)sc.nextInt();
        var attack = (double)sc.nextInt();
        var needCount = Math.ceil(hitPoint / attack);
        System.out.println((int)needCount);
    }
}
