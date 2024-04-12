package Recyrs;

import java.util.Scanner;

public class RecursTask5 {                          //java314 Гиниятуллин А_Ф
    public static String recurs(int n) {                // Todo Цифры числа слева направо Из натурального числа в строку через пробелы

        if (n < 10) {                                      // Если число до 10, и самый первый разряд числа выводим
            return Integer.toString(n);
        }
        else {
            return recurs(n / 10) + " " + n % 10;      // Рекурсия
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число N");
        n = sc.nextInt();
        System.out.println(recurs(n)); // Вызов рекурсии
    }
}
