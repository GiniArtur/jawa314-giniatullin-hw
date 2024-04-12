package ClassWork;


import jdk.internal.icu.impl.BMPSet;

import java.util.Arrays;
import java.util.Scanner;

public class StringTask3 {
    private static BMPSet ArrayUtils;                                                     // Java314 Гиниятуллин_АФ

    public static void main(String[] args) {                               // Todo Из двух строк сформировать одну- любым удобным способом
        System.out.println("Введите первую строку :");
        Scanner scanner = new Scanner(System.in);                                  // (без использования множеств), в которой будут только уникальные
        String str1 = scanner.nextLine();                                          //(не встречающиеся в другой строке) слова.
        System.out.println("Введите вторую строку :");
        String str2 = scanner.nextLine();
        String str3 = str1.concat(str2);
        System.out.println(Arrays.toString(new String[]{str3}));
        String[] words = str3.split(" ");                          // Разбиваем строку на слова  по пробелу


        for (int i = 0; i < words.length; i++) {
            String str = words[i];                          // дополнительная переменная
            for (int j = i + 1; j < words.length; j++) {
                if (str == null)
                    break;
                if (str.equals(words[j])) {              // сравнение текста
                    words[i] = " ";                    // в массиве
                    words[j] = " ";                    // либо Null
                }
            }
        }
        System.out.println(Arrays.toString(words));
        String wordsAsString = Arrays.toString(words);
        System.out.println(wordsAsString);
    }
}
 /*public static String makeStr(String text, String[] stopWords) {                        // Здесь пробовал с помощью ARRAYUTILS проверить вхождение слова в массиве
        var myWords = text.split(" ");                                                    // и если встречалось повторение хотел заменить на строку "$#%!"
        String sequence = "$#%!";                                                         // не получилось
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 0; i < myWords.length; i++) {
            if (ArrayUtils.contains(stopWords, myWords[i]))
                joiner.add(sequence);
             else joiner.add(myWords[i]);
        }
        return joiner.toString();
    }*/









