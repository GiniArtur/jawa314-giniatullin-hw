package Examples;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Factorial4 {
    public static void main(String[] args) {
        int result = 1, n = -1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        try {
            n = scan.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("Неверный ввод");
            return;
        }
        if (n < 0) {
            System.out.println("Неверный ввод");
            return;
        }
        if (n == 0 || n == 1) {
            System.out.println("Факториал числа " + n + " нельзя вычислить!");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(n);
        sb.append("!=");
        for (int i = 1; i <= n; i++) {
            result *= i;
            sb.append(i);
            sb.append("*");
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append("=");
        sb.append(result);
        System.out.println(sb.toString());
    }
}

