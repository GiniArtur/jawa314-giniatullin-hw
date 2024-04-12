package Recyrs;

import java.util.Scanner;

public class RecursTask2 {                   //Java314 Гиниятуллин_АФ
    public static int recurs(double n) {     // TODO  РЕКУРСИЯ   Является ли число натуральное число N точной степенью двойки?
        if (n == 1) {                        //
            return 1;
        } else if (n > 1 && n < 2) {         // Если число после деления на два С Остатком
            return 0;
        } else {
            return recurs(n / 2);         // Рекурсивное условие
        }
    }

    public static void main(String[] args) {
        double n;
        System.out.println("Введите натуральное число  N :");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        // вызов рекурсивной функции
        if (recurs(n) == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

