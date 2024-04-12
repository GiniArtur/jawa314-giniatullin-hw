package Recyrs;

import java.util.Scanner;                                //Java314 Гиниятуллин_АФ

public class RecursyTask9 {                              // Todo Рекурсия сумма чисел от А до В
    static int sum(int a, int b) {
        return a == b? b : a + sum(a + 1, b);
    }
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число A");
        a = sc.nextInt();
        int b;
        System.out.println("Введите число B");
        b = sc.nextInt();
        System.out.println(sum(a,b));

    }


}
