package ClassWork;

import java.util.Scanner;

public class RecursTask3 {                              //Java314 Гиниятуллин_АФ
    public static int sum(int a, int b) {                  // TODO РЕкурсия Вывод суммы чисел
        if (a > b) return sum(b,a);
        if(b==a) return a;

        return a + sum(a+1, b);
    }

    public static void main(String[] args) {
        int a;
        System.out.println("Введите число А :");
        Scanner sc = new Scanner(System.in);
        int b;
        a = sc.nextInt();
        System.out.println("Введите число B :");
        b = sc.nextInt();
        System.out.println(" сумма равна = " + sum(a, b));


    }
}

