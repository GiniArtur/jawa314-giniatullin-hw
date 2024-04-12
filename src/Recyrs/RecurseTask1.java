package Recyrs;

import java.util.Scanner;

public class RecurseTask1 {
    public static void main(String[] args) {             // Java314_Гиниятуллин_АФ
        int a;                                           // TODO РЕкурсия: Вывод на экран чисел от А до В в порядке возрастания если А>B и наоборот если В>A
        System.out.println("Введите число А :");
        Scanner sc = new Scanner(System.in);
        int b;
        a = sc.nextInt();
        System.out.println("Введите число В :");
        b = sc.nextInt();
        System.out.println(printAtoB(a, b));
    }

    static String printAtoB(int a, int b) {
        if (a > b) {                         // Вариант 1 А>В
            if (a == b) {
                return Integer.toString(a);
            }

            return a + " " + printAtoB(a - 1, b);    // Шаг рекурсии / рекурсивное условие
        } else {                                        // Вариант 2 А<В
            if (a == b) {
                return Integer.toString(a);
            }
            return a + " " + printAtoB(a + 1, b);    // Шаг рекурсии / рекурсивное условие
        }
    }
}

