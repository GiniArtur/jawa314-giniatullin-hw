package StringsMethods;

import java.util.Arrays;
import java.util.Scanner;

public class AverageLength {                                           // Java314 Гиниятуллин_АФ
    public static void main(String[] args) {
        System.out.println("Введите строку :");                         // TODO Строки. Средняя длина слова
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        sentence = sentence.trim(); // Убираем лишние пробелы в начале и конце строки

        String[] words = sentence.split(" ");// Разбиваем строку на слова \\s+ значит по пробелам + -это значит более одного пробела
        int totalLength = 0;
        System.out.println(Arrays.toString(words));
        for (String word : words) {
            totalLength += word.length();
        }
        double averageLength = (double) totalLength / words.length;// Вычисляем среднюю длину слова
        System.out.println("Средняя длина слова: " + averageLength);

    }
}



