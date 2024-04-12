package Examples;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число ");
        int value = sc.nextInt();
        int result = 1;
        for (int i = value; i > 0; i--) {
            result *= i;
        }
        System.out.println("Факториал числа " + value + "равен " + result);

        String str = String.format("Привет - %s! Как дела %s?", "Саша", "на работе");
        System.out.println(str);
    }
}
