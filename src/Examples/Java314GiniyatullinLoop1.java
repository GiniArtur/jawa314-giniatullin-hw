package Examples;

import java.util.Arrays;
import java.util.Scanner;

public class Java314GiniyatullinLoop1 {         // Todo Условия для ВИСОКОСНОГО Года java314 Гиниятуллин
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите год");
        int year = sc.nextInt();
        boolean leapYear = false;
        if ((year % 4 == 0) && (year % 100 != 0)) { // Условие високосного года
            leapYear = true;
            System.out.println("Год делиться на 4 без остатка");
        }
        if (year % 400 == 0) { // Условие високосного года
            leapYear = true;
            System.out.println("Год делиться на 400 без остатка");
        }
            if ((year % 100 == 0) && (year % 400 != 0))  // Условие НЕвисокосного года
                System.out.println("Год делится без остатка на 100 и не делится на 400");
            if (leapYear == true)
                System.out.println("Год " + year + " Високосный");
                 else System.out.println("Год " + year + " НЕвисокосный");

    }
}


