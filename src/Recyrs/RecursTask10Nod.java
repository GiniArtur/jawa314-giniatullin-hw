package Recyrs;

import java.util.Scanner;

public class RecursTask10Nod {          //Java314 Гиниятуллин_АФ

    static int nod(int a, int b) {       // TODO Рекурсия Нохождение НОД
        if (b == 0) {
            return a;
        } else return nod(b, a % b);
    }

    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число A");
        a = sc.nextInt();
        int b;
        System.out.println("Введите число B");
        b = sc.nextInt();
        System.out.println("НОД чисел равен " + nod(a, b));

    }


}
