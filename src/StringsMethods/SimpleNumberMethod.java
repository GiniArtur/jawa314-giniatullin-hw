package StringsMethods;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class SimpleNumberMethod {      // JAVA314 Giniyatullin   Домашняя работа МЕТОДЫ
    public static void main(String[] args) {                      // Todo Нахождение простого числа
        System.out.println("Введите число :");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        boolean conclusion = simpleNumber(n);
        if (conclusion == false) System.out.println("Число " + n + "- НЕ простое");
        else System.out.println("Число " + n + " простое");

    }

    public static boolean simpleNumber(int n) {
        if (n < 2) return false;
        double sq = sqrt(n);
        for (int i = 2; i < sq; i++) {
            if (n % i == 0) return false;

        }
        return true;
    }
}
