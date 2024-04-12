package ClassWork;

import java.util.Arrays;

public class StringTask2 {                      // JAVA314 Giniyatullin   Самостоятельная работа
    public static void main(String[] args) {    //TODO В строке определить какой символ встречается больше всего
        String str = "ABSDE is my familyyyyyy";
        str = str.replaceAll("[^a-zA-Z]+", "").toUpperCase();
        int[] data = new int[25];
        System.out.println("Строка после первого преобразования : " + str);

        char alphabet = 65;                                        // Присволи  alphabet код Ascii(65) -   буква 'A'

        System.out.println(" символ A - в Ascii " + alphabet);

        int counter = 0;                                              //Счетчик для символа
        int index =0;

        for (int i = 0; i < 25; i++) {                                // проходим по кодам Ascii( с 65 по 90) английский алфавит
            for (int j = 0; j < str.length(); j++) {
                if ((alphabet) == ((str.charAt(j)))) counter++;
            }
            data[i] = counter;
            alphabet++;
            counter = 0;

        }
        System.out.println("массив вхождений букв " + Arrays.toString(data));
        int max = data[0];
        for (int i = 0; i < 25; i++) {
            if (data[i]>max) {
                max = data[i];
                index=i;
            }
        }
        System.out.println("Буква  "+ index + " больше всего встречается "+max+"раз");
    }
}
