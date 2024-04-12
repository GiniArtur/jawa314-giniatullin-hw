package StringsMethods;

import java.util.Arrays;
import java.util.Scanner;

public class LowerUpperCase {                            //Java314 Гиниятуллин_АФ
    public static void main(String[] args) {             //
        System.out.println("Введите строку :");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();

        sentence = sentence.trim(); // Убираем лишние пробелы в начале и конце строки
        System.out.println(Arrays.toString(new String[]{sentence}));
        char[] chars = sentence.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (Character.isUpperCase(c)) {
                chars[i] = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                chars[i] = Character.toUpperCase(c);
            }
        }
        for (int i = 0; i < chars.length; i++) {
            if ((chars[i] == '1') || (chars[i] == '2') || (chars[i] == '3') || (chars[i] == '4') || (chars[i] == '5') || (chars[i] == '6') || (chars[i] == '7') || (chars[i] == '8') || (chars[i] == '9') || (chars[i] == '0')) {
                chars[i] = '_';
            }
        }
        System.out.println(new String(chars));
    }
}
