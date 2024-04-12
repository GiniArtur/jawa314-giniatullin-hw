package StringsMethods;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTask3 {
    public static void main(String[] args) {
        System.out.println("Введите строку :");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();

        sentence = sentence.trim(); // Убираем лишние пробелы в начале и конце строки

        String[] words = sentence.split(" ");// Разбиваем строку на слова \\s+ значит по пробелам + -это значит более одного пробела
        System.out.println(Arrays.toString(words));


        Pattern p = Pattern.compile("^[aeyuio][a-z]+[^aeyuio]$"); //Регулярные выражения. Использование классов  Pattern и Matcher
        Matcher m;

        for (String string2 : words) {
            m = p.matcher(string2);
            if (m.matches()) {
                System.out.println(string2);
            }
        }
    }
}

