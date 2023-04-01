package abc296.b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        String result = "";
        for (int i = 0; i < 8; i++) {
            final var row = sc.next();
            if (!row.contains("*")) {
                continue;
            }
            final var rowArray = row.split("");
            for (int j = 0; j < row.length(); j++) {
                if (rowArray[j].equals("*")) {
                    final String first;
                    switch (j) {
                        case 0:
                            first = "a";
                            break;
                        case 1:
                            first = "b";
                            break;
                        case 2:
                            first = "c";
                            break;
                        case 3:
                            first = "d";
                            break;
                        case 4:
                            first = "e";
                            break;
                        case 5:
                            first = "f";
                            break;
                        case 6:
                            first = "g";
                            break;
                        case 7:
                            first = "h";
                            break;
                        default:
                            first = "";
                    }
                    result = first + (8 - i);
                    break;
                }
            }
            break;
        }

        System.out.println(result);

        sc.close();
    }
}