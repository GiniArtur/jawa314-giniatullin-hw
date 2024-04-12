package ClassWork;

import java.util.Arrays;
import java.util.Scanner;

public class StringTask4 {                                   //Java314 Гиниятуллин_АФ
    public static void main(String[] args) {                               // Todo Из двух строк сформировать одну- в АЛФАВИДНОМ ПОРЯДКЕ
        System.out.println("Введите первую строку, в конце пробел :");
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        System.out.println("Введите вторую строку, в конце пробел :");
        String str2 = scanner.nextLine();
        String str3 = str1.concat(str2);
        System.out.println(Arrays.toString(new String[]{str3}));
        String[] words = str3.split(" ");                          // Разбиваем строку на слова  по пробелу
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].toLowerCase();
        }
        System.out.println(Arrays.toString(words));
        String temp = "";                                                // дополнительная переменная
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length - 1; j++) {
                if (words[j].charAt(0) > words[j + 1].charAt(0)) {
                    temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(words));
    }
}

