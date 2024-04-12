package Recyrs;

import java.util.Scanner;                          //java314 Гиниятуллин_АФ

public class RecursTask3 {                         // Todo Дано натуральное число N. Вычислите сумму его цифр.
    public static int recurs(int n) {

        if (n < 10) {                             // Если только одна цифра
            return n;
        } else {
            return n % 10 + recurs(n / 10);     // Рекурсия
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число N");
        n = sc.nextInt();
        System.out.println("Сумма цифр числа равна - " + recurs(n));            // вызов рекурсивной функции
    }
}

