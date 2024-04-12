package ClassWork;

import java.util.Scanner;

public class RecursTask4 {
    public static void main(String[] args) {             // Java314_Гиниятуллин_АФ
        int a;                                           // TODO РЕкурсия: Вывод на экран чисел от 0 до B
        int b;
        System.out.println("Введите число А :");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.out.println("Введите число В :");
        b = sc.nextInt();
        System.out.println(printAtoB(a, b));
    }

    static String printAtoB(int a, int b) {
        if (a == b) {
            return Integer.toString(a);
        }
        return a + " " + printAtoB(a + 1, b);    // Рекурсия
    }
}


