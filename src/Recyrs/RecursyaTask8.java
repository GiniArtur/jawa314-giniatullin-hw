package Recyrs;

import java.io.PrintStream;
import java.util.Scanner;

public class RecursyaTask8 {                                //Java314 Гиниятуллин
    public static double extent(double x, int p) {          //TODO Рекурсия возведение числа в степень
        if (x == 0 && p <= 0) {
            throw new ArithmeticException("Невозможно возвести 0 в степень меньше 1");    //Создается исключение ArithmeticException
        }                                                                                // о в о степени?????
        if (x == 1 || x == 0)
            return x;                                                                  // в консоль выйдет : {Exception in thread "main" java.lang.ArithmeticException:
        if (p > 1)
            return x * extent(x, --p);                                               // Невозможно возвести 0 в степень меньше 1}
        if (p < 1) return 1 / x * extent(x, ++p);
        return x;
    }

    public static void main(String[] args) {
        double m;
        int p;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число M");
        m = sc.nextInt();
        System.out.println("Введите степень P");
        p = sc.nextInt();

        System.out.println("Степень числа " +m+ " в степени "+p+" равна "+extent(m, p));

    }
}

