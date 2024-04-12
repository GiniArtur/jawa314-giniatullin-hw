package Recyrs;

import java.util.Scanner;

public class RecursTask4 {                     //Java314 Гиниятуллин_АФ
    public static int recurs(int n) {          // TODO Цифры числа справа налево

        if (n < 10) {                         // Если только одна цифра
            return n;
        }
        else {
            System.out.print(n % 10 + " ");      // Шаг рекурсии / рекурсивное условие
            return recurs(n / 10);
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число N");
        n = sc.nextInt();
        System.out.println(recurs(n)); // вызов рекурсивной функции
    }
}

