package past201912_f;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final var s = sc.next();
        // Stringからchar配列へ
        final var sArray = s.chars()
                .mapToObj(c -> (char) c)
                .toArray(Character[]::new);
        final var wordCount = (int) Arrays.stream(sArray)
                // 大文字判定
                .filter(Character::isUpperCase)
                .count() / 2;
        String[] wordArray = new String[wordCount];

        var startFlg = false;
        var j = 0;
        for (int i = 0; i < wordArray.length; i++) {
            StringBuilder word = new StringBuilder();
            for (; j < sArray.length; j++) {
                if (Character.isUpperCase(sArray[j]) && !startFlg) {
                    startFlg = true;
                    word.append(sArray[j]);
                } else if (Character.isUpperCase(sArray[j]) && startFlg) {
                    word.append(sArray[j]);
                    wordArray[i] = word.toString();
                    startFlg = false;
                    j++;
                    break;
                } else {
                    word.append(sArray[j]);
                }
            }
        }

        final var result = Arrays.stream(wordArray)
                // 大文字小文字無視ソート
                .sorted(String.CASE_INSENSITIVE_ORDER)
                .collect(Collectors.joining());
        System.out.println(result);

        sc.close();
    }
}
